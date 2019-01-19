import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * @author Shiwakant Bharti
 * @start 14-Sep-2014 : 9:31:12 pm
 * @accepted
 * @deltamins
 * @description
 * 
 */
class FactorizationBrute {
    public static void readAndProcess() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    System.out));

            int T = Integer.parseInt(br.readLine());

            BigInteger bigN;
            int N;

            for (int i = 0; i < T; i++) {
                bigN = new BigInteger(br.readLine());
                bw.write(BigInteger.ONE.toString());
                bw.newLine();
                bw.write(bigN.toString());
                bw.newLine();
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readAndProcess();
    }
}