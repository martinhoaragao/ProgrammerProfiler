
import java.io.*;

class doublestring 
{

    public static void main(String args[]) throws IOException 
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(obj.readLine());
        while (t > 0) 
        {
            int n = Integer.parseInt(obj.readLine());
            if (n % 2 == 0) 
            
                System.out.println(n);
             
            else 
            
                System.out.println(n-1);
            
            t--;
        }
    }
}
