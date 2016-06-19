import java.util.*;

public class ProfileInferrer {
    Map<String, Float> skill, readability;
    Map<String, Boundaries> bound;
    TreeMap<Float, TreeMap<Float, String>> values;

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

        bound = new HashMap<>();

        bound.put("Novice", new Boundaries(minS, avgS - halfThirdS, minR, avgR - halfThirdR));
        bound.put("Advanced Beginner S", new Boundaries(avgS - halfThirdS, avgS + halfThirdS, minR, avgR - halfThirdR));
        bound.put("Advanced Beginner R", new Boundaries(minS, avgS - halfThirdS, avgR - halfThirdR, avgR + halfThirdR));
        bound.put("Advanced Beginner +", new Boundaries(avgS - halfThirdS, avgS + halfThirdS, avgR - halfThirdR, avgR + halfThirdR));
        bound.put("Expert", new Boundaries(avgS + halfThirdS, maxS, minR, avgR + halfThirdR));
        bound.put("Proficient", new Boundaries(minS, avgS + halfThirdS, avgR + halfThirdR, maxR));
        bound.put("Master", new Boundaries(avgS + halfThirdS, maxS, avgR + halfThirdR, maxR));
    }

    public void inferProfile() {
        values = new TreeMap<>();
        for (String n : skill.keySet()) {
            TreeMap<Float, String> tm = new TreeMap<>();
            tm.put(readability.get(n), n);
            values.put(skill.get(n), tm);
        }

        for (String p : bound.keySet()) {
            System.out.println("\n" + p + ":");
            Boundaries b = new Boundaries(bound.get(p));
            System.out.println(getProfile(b.getMinS(), b.getMaxS(), b.getMinR(), b.getMaxR()).toString());
        }
    }

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

    private float getMin(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.min(list);
    }

    private float getMax(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.max(list);
    }

    private float getAvg(Map<String, Float> m) {
        float avg = 0;
        ArrayList<Float> list = new ArrayList<>(m.values());
        for (float v : list) {
            avg += v;
        }
        return avg / list.size();
    }
}
