import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LinesExtractor {

    private LinkedList<File> files;
    private int linesOfCode;
    private int linesOfComments;
    private int emptyLines;
    private int totalLines;
    private double commentsCodeRatio;

    public LinesExtractor (LinkedList<File> files) {
        this.files = files;
    }

    public void run() throws IOException {
        // All local instance variables.

        // The input reader from which we read Java code.
        BufferedReader in;

        // The total number of legitimate lines of code we have counted.
        int number_lines = 0;

        // The total number of legitimate comments we have counted.
        int number_comments = 0;

        // The total number of legitimate empty lines we have counted.
        int number_empty = 0;

        // The total number of lines we have counted.
        int number_total = 0;

        // A flag indicating if we are inside of a comment or not.
        boolean inside_comment = false;

        // The current line of code we are examining.
        String s;

        for (File f : files) {

            in = new BufferedReader(new FileReader(f.getAbsolutePath()));

            // Read in lines of code from the stream until we reach the end
            // of the input.

            while ((s = in.readLine()) != null) {

                //increment total of lines
                number_total++;

                // if line has "/*" followed by "*/" then bump # of comments
                if ((s.contains("/*")) && (s.contains("*/"))) {
                    if (s.trim().length() > 6) {
                        number_comments++;
                    }
                } else if (s.contains("//")) {
                    // if line has "//" bump number of comments
                    if (s.trim().length() > 3) {
                        number_comments++;
                    }
                } else if ((s.contains("/*")) && (!s.contains("*/"))) {
                    // if we just see a "/*" then we are moving inside a comment
                    inside_comment = true;
                    if (s.trim().length() > 3) {
                        number_comments++;
                    }
                } else if ((!s.contains("/*")) && (s.contains("*/"))) {
                    // if we are inside a comment and we see a "*/" then we end it
                    inside_comment = false;
                    if (s.trim().length() > 3) {
                        number_comments++;
                    }
                } else if (inside_comment) {
                    // number of comments if we are inside a comment and not
                    // on an all whitespace line
                    if (s.trim().length() > 3) {
                        number_comments++;
                    }
                } else if (s.trim().isEmpty()) {
                    // number of completely empty lines
                    number_empty++;
                }

                // bump number of lines only if we are not on a line of all whitespace

                if (s.trim().length() > 3) {
                    number_lines++;
                }
            }

            in.close();
        }

        linesOfCode = number_lines;
        linesOfComments = number_comments;
        emptyLines = number_empty;
        totalLines = number_total;
        commentsCodeRatio = ((double)number_comments/number_lines+0.005);
    }

    public double getCommentsCodeRatio() {
        return commentsCodeRatio;
    }

    public int[] getMetrics() {
        return new int[]{linesOfCode, linesOfComments, emptyLines, totalLines};
    }
}
