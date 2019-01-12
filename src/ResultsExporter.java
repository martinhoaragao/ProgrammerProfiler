import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ResultsExporter {

    private final Map<String, Float> skill, readability;

    public ResultsExporter(Map<String, Float> readability, Map<String, Float> skill) {
        this.readability = readability;
        this.skill = skill;
    }

    public void createJSONFile(String folderName) {
        JsonWriter writer;
        try {
            writer = new JsonWriter(new FileWriter("results/" + folderName + ".json"));
            writer.setIndent("    ");
            writer.beginArray();
            for (String n : skill.keySet()) {
                writer.beginObject();
                writer.name("name").value(n);
                writer.name("skill").value(skill.get(n));
                writer.name("readability").value(readability.get(n));
                writer.endObject();
            }
            writer.endArray();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
