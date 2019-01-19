import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gayatrisingh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int t = 0;
        while(t < T) {
            int N = Integer.parseInt(br.readLine());
            if(N % 2 == 0)
                System.out.println(N);
            else
                System.out.println(N-1);
            t++;
        }
    }
    
}