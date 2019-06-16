import java.util.*;

public class ProfileInferrer {
    private HashMap<String, Project> projects;
    private final Map<String, Float> skill, readability;
    private List<Boundaries> bound;
    private TreeMap<Float, TreeMap<Float, ArrayList<String>>> values;
    private StringBuilder log;
    private LinkedHashMap<String, ArrayList<Project>> profileToProjects;
    private int minSi, maxSi, minRi, maxRi;

    public ProfileInferrer(Map<String, Float> readability, Map<String, Float> skill, HashMap<String, Project> projects) {
        this.readability = readability;
        this.skill = skill;
        this.projects = projects;
    }

    public ProfileInferrer(Map<String, Float> readability, Map<String, Float> skill) {
        this.readability = readability;
        this.skill = skill;
    }

    public void calcBoundaries() {

        float minS = getMin(skill);
        float maxS = getMax(skill);
        float minR = getMin(readability);
        float maxR = getMax(readability);

        float distS = maxS - minS;
        float distR = maxR - minR;
        float thirdS = distS / 3;
        float thirdR = distR / 3;

        log = new StringBuilder();
        boundariesLog(minS, maxS, minR, maxR); //Add boundaries info to log

        minS -= 0.01;
        maxS += 0.01;
        minR -= 0.01;
        maxR += 0.01;

        minSi = Math.round(minS) - 1;
        maxSi = Math.round(maxS) + 1;
        minRi = Math.round(minR) - 1;
        maxRi = Math.round(maxR) + 1;

        bound = new LinkedList<>();

        bound.add(new Boundaries("Novice", minS, minS + thirdS, minR, minR + thirdR));
        bound.add(new Boundaries("Advanced Beginner S", minS + thirdS, minS + 2*thirdS , minR, minR + thirdR));
        bound.add(new Boundaries("Advanced Beginner R", minS, minS + thirdS, minR + thirdR, minR + 2*thirdR));
        bound.add(new Boundaries("Advanced Beginner +", minS + thirdS, minS + 2*thirdS, minR + thirdR, minR + 2*thirdR));
        bound.add(new Boundaries("Expert", maxS - thirdS, maxS, minR, minR + 2*thirdR));
        bound.add(new Boundaries("Proficient", minS, minS + 2*thirdS, maxR - thirdR, maxR));
        bound.add(new Boundaries("Master", maxS - thirdS, maxS, maxR - thirdR, maxR));
    }

    public void inferProfile() {
        values = new TreeMap<>(); //TreeMap<Skill, TreeMap<Readability, ArrayList<ProjectName>>>

        //put S and R scores in treemap for easy inferring
        for (String n : skill.keySet()) {
            float s = skill.get(n);
            float r = readability.get(n);
            ArrayList<String> al;
            TreeMap<Float, ArrayList<String>> tm;
            if (values.containsKey(s)) { // Already exists an equal skill value
                tm = values.get(s);
                if (tm.containsKey(r)) { // Already exists an equal skill AND readability value
                    al = tm.get(r);
                    al.add(n);
                    tm.put(r, al);
                } else {                // Only exists an equal skill value
                    al = new ArrayList<>();
                    al.add(n);
                    tm.put(r, al);
                }
            } else {                    // Skill value is new
                tm = new TreeMap<>();
                al = new ArrayList<>();
                al.add(n);
                tm.put(r, al);
            }
            values.put(s, tm);
        }

        log.append("\n*Final scores*\n");
        System.out.println();

        profileToProjects = new LinkedHashMap<>();

        for (Boundaries b : bound) {
            ArrayList<String> profiles = new ArrayList<>(getProfile(b.getMinS(), b.getMaxS(), b.getMinR(), b.getMaxR()));
            ArrayList<Project> projectsPart = new ArrayList<>();
            for (String p : profiles) {
                Project project = projects.get(p);
                project.setProfile(b.getProfileName(), skill.get(p), readability.get(p));
                projects.put(p, project);

                projectsPart.add(new Project(p, skill.get(p), readability.get(p)));
            }
            profileToProjects.put(b.getProfileName(), projectsPart);

            String profileStr = profiles.toString();
            log.append(b.getProfileName()).append(":\n");
            log.append(profileStr).append("\n\n");
            System.out.println(b.getProfileName() + ":");
            System.out.println(profileStr);
        }
    }

    //Get all solutions for a given range. The range is the profile.
    private ArrayList<String> getProfile (float minS, float maxS, float minR, float maxR) {
        ArrayList<String> vals = new ArrayList<>();
        for (float x : values.subMap(minS, maxS).keySet()) {
            for (ArrayList<String> y : values.get(x).subMap(minR, maxR).values()) {
                // y here, represents the values of points in range...
                vals.addAll(y);
            }
        }
        return vals;
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

    //Average of the map values
    private float getAvg(Map<String, Float> m) {
        float avg = 0;
        ArrayList<Float> list = new ArrayList<>(m.values());
        for (float v : list) {
            avg += v;
        }
        return avg / list.size();
    }

    private void boundariesLog(float minS, float maxS, float minR, float maxR) {
        for (String p : skill.keySet()) {
            if (skill.get(p) == minS) {
                log.append("Lowest skill is ").append(minS).append(" for ").append(p).append("\n");
                System.out.println("Lowest skill is " + minS + " for " + p);
            }
            if (skill.get(p) == maxS) {
                log.append("Highest skill is ").append(maxS).append(" for ").append(p).append("\n");
                System.out.println("Highest skill is " + maxS + " for " + p);
            }
        }
        for (String p : readability.keySet()) {
            if (readability.get(p) == minR) {
                log.append("Lowest readability is ").append(minR).append(" for ").append(p).append("\n");
                System.out.println("Lowest readability is " + minR + " for " + p);
            }
            if (readability.get(p) == maxR) {
                log.append("Highest readability is ").append(maxR).append(" for ").append(p).append("\n");
                System.out.println("Highest readability is " + maxR + " for " + p);
            }
        }
    }

    public StringBuilder getLog() {
        return log;
    }

    public LinkedHashMap<String, ArrayList<Project>> getProfileToProjects() {
        return profileToProjects;
    }

    public int getMaxR() {
        return maxRi;
    }

    public int getMaxS() {
        return maxSi;
    }

    public int getMinR() {
        return minRi;
    }

    public int getMinS() {
        return minSi;
    }

    private class Boundaries {

        final String profile;
        //(S)kill and (R)eadability
        private final float minS, maxS, minR, maxR;

        Boundaries(String profile, float minS, float maxS, float minR, float maxR) {
            this.profile = profile;
            this.minS = minS;
            this.maxS = maxS;
            this.minR = minR;
            this.maxR = maxR;
        }

        String getProfileName() {
            return profile;
        }

        float getMaxR() {
            return maxR;
        }

        float getMaxS() {
            return maxS;
        }

        float getMinR() {
            return minR;
        }

        float getMinS() {
            return minS;
        }
    }

}


