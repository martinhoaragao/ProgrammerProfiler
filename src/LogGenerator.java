import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogGenerator {

    String directory;
    StringBuilder sc, pi, log;

    public LogGenerator(String directory, StringBuilder sc, StringBuilder pi) {
        this.directory = directory;
        this.sc = sc;
        this.pi = pi;
    }

    public void generateLog() {
        log = new StringBuilder();
        String timeStamp = getCurrentTime();
        log.append("Programmer Profiler Tool\n\n");
        log.append("*** Log Report ***\n");
        log.append("Generated on ");
        log.append(timeStamp).append("\n\n");
        log.append("PP Analysis: \n");
        log.append(sc);
        log.append(pi);
    }

    public void writeLogToFile() throws IOException {
        String[] nodes = directory.split("/");
        String folderName = nodes[nodes.length - 1];
        Files.write(Paths.get(directory + "/" + folderName + "_log.txt"), log.toString().getBytes());
    }

    private String getCurrentTime() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
