
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by cv on 10/3/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int T; //number of test cases
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while( T-- > 0 ) {
            int N = Integer.parseInt(br.readLine());
            int id_sum = 0; // Sum of all the id's
            int sumOfSum = 0; // Sum of the sum's of childs of all the id's
            String temp[];
            for(int i = 0; i < N ; i++ ) {
                temp = br.readLine().split(" ");
                id_sum += Integer.parseInt(temp[0]);
                sumOfSum += Integer.parseInt(temp[1]);
            }
            int result = id_sum - sumOfSum;

            System.out.println(result);
        }
    }
}
