import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Driver
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);

            int t = Integer.parseInt(br.readLine().trim());
            // I read the editorial awhile before attempting this question
            // I believe that I have found the solution again
            while(t-- > 0){
                int n = Integer.parseInt(br.readLine().trim());
                int idSum = 0;
                int childrenSum = 0;
                for(int i = 0; i < n; i++){
                    String[] s = br.readLine().trim().split(" ");
                    idSum += Integer.parseInt(s[0]);
                    childrenSum += Integer.parseInt(s[1]);
                }

                pw.println((idSum - childrenSum));
            }

            pw.close();
        }
        catch(Exception ex)
        {
            System.out.println("ERROR");
        }
    }
} 