import java.util.*;
import java.util.stream.Collectors;

class ImprovedProfileInferrer {

    private final Map<String, Float> skill, readability;
    private StringBuilder log;
    private LinkedHashMap<String, ArrayList<Project>> profileToProjects;
    private HashMap<String, Float> boundaries;
    private float maxS, maxR, minS, minR;
    private int minSi, maxSi, minRi, maxRi;

    ImprovedProfileInferrer(Map<String, Float> readability, Map<String, Float> skill) {
        this.readability = readability;
        this.skill = skill;
    }

    void calcBoundaries() {

        maxS = getMax(skill);
        maxR = getMax(readability);

        float length = normalize();

        minS = getMin(skill);
        maxS = getMax(skill);
        minR = getMin(readability);
        maxR = getMax(readability);

        log = new StringBuilder();
        boundariesLog(minS, maxS, minR, maxR); //Add boundaries info to log

        float third = length / 3.0f;

        boundaries = new HashMap<>();
        boundaries.put("N", length); //Novice
        boundaries.put("AB", length - third); //Advanced Beginner
        boundaries.put("EP", length - (2 * third)); //Expert / Proficient
        boundaries.put("M", length - (3 * third)); //Master == 0

        minSi = Math.round(minS - 0.01f) - 1;
        maxSi = Math.round(maxS + 0.01f) + 1;
        minRi = Math.round(minR - 0.01f) - 1;
        maxRi = Math.round(maxR + 0.01f) + 1;

    }

    private float normalize() {

        float lengthS = maxS - minS;
        float lengthR = maxR - minR;
        float ret;

        if (lengthR > lengthS) {
            ret = lengthR;
            float diff = lengthR / lengthS;

            for (Map.Entry<String, Float> s : skill.entrySet()) {
                skill.put(s.getKey(), s.getValue() * diff);
            }
        } else {
            ret = lengthS;
            float diff = lengthS / lengthR;

            for (Map.Entry<String, Float> r : readability.entrySet()) {
                readability.put(r.getKey(), r.getValue() * diff);
            }
        }
        return ret;
    }

    void inferProfile() {

        profileToProjects = new LinkedHashMap<>();
        ArrayList<Project> novice = new ArrayList<>();
        ArrayList<Project> advbegS = new ArrayList<>();
        ArrayList<Project> advbegR = new ArrayList<>();
        ArrayList<Project> expert = new ArrayList<>();
        ArrayList<Project> proficient = new ArrayList<>();
        ArrayList<Project> master = new ArrayList<>();

        float diff = maxR / maxS;

        for (String n : skill.keySet()) {
            float s = skill.get(n);
            float r = readability.get(n);

            float distS = maxS - s;
            float distR = maxR - r;
            double dist = Math.sqrt(Math.pow(distS,2) + Math.pow(distR,2));
            if (dist > boundaries.get("N")) {
                //Novice
                novice.add(new Project(n, s, r));
            }
            else if (dist > boundaries.get("AB")) {
                    //Advanced Beginner
                    if (r > s * diff){
                        advbegR.add(new Project(n, s, r));
                    } else {
                        advbegS.add(new Project(n, s, r));
                    }
                }
                else if (dist > boundaries.get("EP")) {
                        //Expert Proficient
                        if (r > s * diff){
                            proficient.add(new Project(n, s, r));
                        } else {
                            expert.add(new Project(n, s, r));
                        }
                    }
                    else {
                        //Master
                        master.add(new Project(n, s, r));
                    }
        }
        profileToProjects.put("Novice", novice);
        profileToProjects.put("Advanced Beginner S", advbegS);
        profileToProjects.put("Advanced Beginner R", advbegR);
        profileToProjects.put("Expert", expert);
        profileToProjects.put("Proficient", proficient);
        profileToProjects.put("Master", master);

        resultLog(novice, advbegR, advbegS, proficient, expert, master);

    }

    //Lowest map value
    private float getMin(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.min(list);
    }

    //Highest map value
    private float getMax(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.max(list);
    }

    LinkedHashMap<String, ArrayList<Project>> getProfileToProjects() {
        return profileToProjects;
    }

    int getMaxR() {
        return maxRi;
    }

    int getMaxS() {
        return maxSi;
    }

    int getMinR() {
        return minRi;
    }

    int getMinS() {
        return minSi;
    }

    private void boundariesLog(float minS, float maxS, float minR, float maxR) {
        for (String p : skill.keySet()) {
            if (skill.get(p) == minS) {
                log.append("Lowest skill is ").append(minS).append(" for ").append(p).append("\n");
            }
            if (skill.get(p) == maxS) {
                log.append("Highest skill is ").append(maxS).append(" for ").append(p).append("\n");
            }
        }
        for (String p : readability.keySet()) {
            if (readability.get(p) == minR) {
                log.append("Lowest readability is ").append(minR).append(" for ").append(p).append("\n");
            }
            if (readability.get(p) == maxR) {
                log.append("Highest readability is ").append(maxR).append(" for ").append(p).append("\n");
            }
        }
    }

    private void resultLog(ArrayList<Project> novice, ArrayList<Project> advbegR, ArrayList<Project> advbegS,
                           ArrayList<Project> proficient, ArrayList<Project> expert, ArrayList<Project> master) {
        log.append("\n\n");
        log.append("Novice:\n");
        log.append(convert(novice).toString());
        log.append("\nAdvanced Beginner R:\n");
        log.append(convert(advbegR).toString());
        log.append("\nAdvanced Beginner S:\n");
        log.append(convert(advbegS).toString());
        log.append("\nProficient:\n");
        log.append(convert(proficient).toString());
        log.append("\nExpert:\n");
        log.append(convert(expert).toString());
        log.append("\nMaster:\n");
        log.append(convert(master).toString());

        System.out.print(log.toString());
    }

    private ArrayList<String> convert(ArrayList<Project> list) {
        return list.stream().map(Project::getProjectName).collect(Collectors.toCollection(ArrayList::new));
    }

    StringBuilder getLog() {
        return log;
    }
}
