import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class PP {

    private static Map<String, List<Result>> results;
    private static int numberOfFiles;
    private static float sAvg, rAvg; //total average values of Skill and Readability

    public static void main (String[] args) throws FileNotFoundException {

        File folder = new File("results");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {

            results = new HashMap<>();
            Map<String, Float> skill, readability;
            numberOfFiles = 0;
            sAvg = rAvg = 0.0f;
            int totRes = 0; //total of results (or solutions)

            Gson gson = new Gson();

            for (File f: listOfFiles) {
                if (f.isFile()) {
                    JsonReader reader = new JsonReader(new FileReader(f.getAbsolutePath()));
                    Type collectionType = new TypeToken<List<Result>>(){}.getType();
                    List<Result> res = gson.fromJson(reader, collectionType);
                    res = new ArrayList<>(normalize(res));
                    for (Result r : res) {
                        String name = r.getName();
                        List<Result> aux;
                        if (results.containsKey(name)) {
                            aux = results.get(name);
                        } else {
                            aux = new ArrayList<>();
                        }
                        aux.add(r);
                        results.put(name, aux);
                        sAvg += r.getSkill();
                        rAvg += r.getReadability();
                    }
                    numberOfFiles++;
                    totRes +=  res.size();
                }
            }

            sAvg = sAvg / (float)totRes;
            rAvg = rAvg / (float)totRes;

            skill = new HashMap<>();
            readability = new HashMap<>();

            for (String n : results.keySet()) {
                float s = getSkillAvg(n);
                float r = getReadabilityAvg(n);
                skill.put(n, s);
                readability.put(n, r);
            }

            ProfileInferrer pi = new ProfileInferrer(readability, skill);
            pi.calcBoundaries();
            pi.inferProfile();

            ResultsPlotter.main(pi.getProfileToProjects(),
                    pi.getMinS(), pi.getMaxS(), pi.getMinR(), pi.getMaxR(),
                    null);
        } else {
            System.err.println("No Result files found.");
        }
    }

    private static List<Result> normalize(List<Result> res) {
        //Normalize all results (0-100)
        float s, r, lowestS, lowestR, highestS, highestR;
        lowestS = highestS = res.get(0).getSkill();
        lowestR = highestR = res.get(0).getReadability();
        for (Result rs : res) {
            s = rs.getSkill();
            r = rs.getReadability();
            if (s < lowestS) {
                lowestS = s;
            } else {
                if (s > highestS) {
                    highestS = s;
                }
            }
            if (r < lowestR) {
                lowestR = r;
            } else {
                if (r > highestR) {
                    highestR = r;
                }
            }
        }
        res = normalizeSkill(res, lowestS, highestS);
        res = normalizeReadability(res, lowestR, highestR);
        return res;
    }

    private static List<Result> normalizeSkill(List<Result> res, float lowestS, float highestS) {
        for (Result r : res) {
            r.setSkill(r.getSkill() - lowestS);
        }
        for (Result r : res) {
            r.setSkill((r.getSkill() * 100.0f) / highestS);
        }
        return res;
    }

    private static List<Result> normalizeReadability(List<Result> res, float lowestR, float highestR) {
        for (Result r : res) {
            r.setReadability(r.getReadability() - lowestR);
        }
        for (Result r : res) {
            r.setReadability((r.getReadability() * 100.0f) / highestR);
        }
        return res;
    }

    private static float getSkillAvg(String n) {
        List<Result> rs = new ArrayList<>(results.get(n));
        float sAux = 0.0f;
        for (Result r : rs) {
            sAux += r.getSkill();
        }
        int diff = numberOfFiles - rs.size();
        sAux += (sAvg * diff);
        return sAux / numberOfFiles;
    }

    private static float getReadabilityAvg(String n) {
        List<Result> rs = new ArrayList<>(results.get(n));
        float rAux = 0.0f;
        for (Result r : rs) {
            rAux += r.getReadability();
        }
        int diff = numberOfFiles - rs.size();
        rAux += (rAvg * diff);
        return rAux / numberOfFiles;
    }

    private class Result {
        private float skill, readability;
        private String name;

        Result(String name, float skill, float readability) {
            this.name = name;
            this.skill = skill;
            this.readability = readability;
        }

        float getSkill() {
            return skill;
        }

        float getReadability() {
            return readability;
        }

        String getName() {
            return name;
        }

        public void setSkill(float skill) {
            this.skill = skill;
        }

        public void setReadability(float readability) {
            this.readability = readability;
        }
    }

}
