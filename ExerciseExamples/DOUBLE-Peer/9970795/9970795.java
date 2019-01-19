import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DoubleStringCodechef {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        while(t-- >0)
        {
            int l =Integer.parseInt(sc.readLine());
            if(l%2!=0)
            {
                l-= 1;
            }
            System.out.println(l);
        }
    }
    
}
