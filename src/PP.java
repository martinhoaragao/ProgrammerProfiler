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

    public static void main (String[] args) throws FileNotFoundException {

        File folder = new File("results");
        File[] listOfFiles = folder.listFiles();
        results = new HashMap<>();
        Map<String, Float> skill, readability;

        Gson gson = new Gson();
        for (File f: listOfFiles) {
            if (f.isFile()) {
                JsonReader reader = new JsonReader(new FileReader(f.getAbsolutePath()));
                Type collectionType = new TypeToken<List<Result>>(){}.getType();
                List<Result> res = gson.fromJson(reader, collectionType);
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
                }
            }
        }

        skill = new HashMap<>();
        readability = new HashMap<>();

        for (String n : results.keySet()) {
            float s = getSkill(n);
            float r = getReadability(n);
            skill.put(n, s);
            readability.put(n, r);
        }

        ProfileInferrer pi = new ProfileInferrer(readability, skill);
        pi.calcBoundaries();
        pi.inferProfile();

        ResultsPlotter.main(pi.getProfileToProjects(),
                pi.getMinS(), pi.getMaxS(), pi.getMinR(), pi.getMaxR(),
                null);

    }

    private static float getSkill(String n) {
        List<Result> rs = new ArrayList<>(results.get(n));
        float aux = 0.0f;
        for (Result r : rs) {
            aux += r.getSkill();
        }
        return aux / (float)rs.size();
    }

    private static float getReadability(String n) {
        List<Result> rs = new ArrayList<>(results.get(n));
        float aux = 0.0f;
        for (Result r : rs) {
            aux += r.getReadability();
        }
        return aux / (float) rs.size();
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
    }

}
