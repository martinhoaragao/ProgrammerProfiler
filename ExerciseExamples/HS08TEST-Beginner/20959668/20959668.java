import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values;

        values = br.readLine().split(" ");
        Double x = Double.valueOf(values[0]);
        Double y = Double.valueOf(values[1]);

        if (x % 5 == 0 && (x + 0.5) <= y) {
            y = y - x - 0.5;
        }
        System.out.printf("%.2f", y);


        br.close();
    }
}
