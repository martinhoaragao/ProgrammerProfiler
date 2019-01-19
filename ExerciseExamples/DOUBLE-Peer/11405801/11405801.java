import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class one {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                int N =  Integer.parseInt(br.readLine());
                if (N%2==0) {
                    System.out.println(N);
                }
                    else{
                        System.out.println(N-1);
                    }


            }
        } catch (Exception e) {
            return;
        }
    }
}