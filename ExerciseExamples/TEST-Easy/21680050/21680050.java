import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int flag = 0;
        while (flag == 0) {
            int temp = Integer.parseInt(br.readLine());
            if (temp != 42) {
                System.out.println(temp);
            }else {
                flag=1;
            }
        }

    }
}
