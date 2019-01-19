import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class DoubleStrings
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int test_case = Integer.parseInt(br.readLine());
        
        while(test_case-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            
            if(n % 2 != 0)
            {
                n--;
            }
            
            pw.println(n);
        }
        
        pw.flush();
    }
}