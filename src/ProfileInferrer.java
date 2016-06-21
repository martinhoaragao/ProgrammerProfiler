import java.util.*;

public class ProfileInferrer {
    private Map<String, Float> skill, readability;
    private List<Boundaries> bound;
    private TreeMap<Float, TreeMap<Float, String>> values;

    public ProfileInferrer(Map<String, Float> readability, Map<String, Float> skill) {
        this.readability = readability;
        this.skill = skill;
    }

    public void calcBoundaries() {

        float minS = getMin(skill);
        float maxS = getMax(skill);
        float avgS = getAvg(skill);
        float minR = getMin(readability);
        float maxR = getMax(readability);
        float avgR = getAvg(readability);
        float distS = maxS - minS;
        float distR = maxR - minR;
        float thirdS = distS / 3;
        float thirdR = distR / 3;
        float halfThirdS = thirdS / 2;
        float halfThirdR = thirdR / 2;
        minS -= 0.01;
        maxS += 0.01;
        minR -= 0.01;
        maxR += 0.01;

        bound = new LinkedList<>();

        bound.add(new Boundaries("Novice", minS, avgS - halfThirdS, minR, avgR - halfThirdR));
        bound.add(new Boundaries("Advanced Beginner S", avgS - halfThirdS, avgS + halfThirdS, minR, avgR - halfThirdR));
        bound.add(new Boundaries("Advanced Beginner R", minS, avgS - halfThirdS, avgR - halfThirdR, avgR + halfThirdR));
        bound.add(new Boundaries("Advanced Beginner +", avgS - halfThirdS, avgS + halfThirdS, avgR - halfThirdR, avgR + halfThirdR));
        bound.add(new Boundaries("Expert", avgS + halfThirdS, maxS, minR, avgR + halfThirdR));
        bound.add(new Boundaries("Proficient", minS, avgS + halfThirdS, avgR + halfThirdR, maxR));
        bound.add(new Boundaries("Master", avgS + halfThirdS, maxS, avgR + halfThirdR, maxR));
    }

    public void inferProfile() {
        values = new TreeMap<>();

        //put S and R scores in treemap for easy inferring
        for (String n : skill.keySet()) {
            TreeMap<Float, String> tm = new TreeMap<>();
            tm.put(readability.get(n), n);
            values.put(skill.get(n), tm);
        }

        for (Boundaries b : bound) {
            System.out.println(b.getProfileName() + ":");
            System.out.println(getProfile(b.getMinS(), b.getMaxS(), b.getMinR(), b.getMaxR()).toString());
        }
    }

    //Get all solutions for a given range. The range is the profile.
    private ArrayList<String> getProfile (float minS, float maxS, float minR, float maxR) {
        ArrayList<String> vals = new ArrayList<>();
        for (float x : values.subMap(minS, maxS).keySet()) {
            for (String y : values.get(x).subMap(minR, maxR).values()) {
                // y here, represents the values of points in range...
                vals.add(y);
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

    private class Boundaries {

        String profile;
        //(S)kill and (R)eadability
        private float minS, maxS, minR, maxR;

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


