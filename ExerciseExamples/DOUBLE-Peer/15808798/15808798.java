import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DOUBLE {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            if(n%2==0)
                System.out.println(n);
            else
                System.out.println(n-1);
        }
    }
}
