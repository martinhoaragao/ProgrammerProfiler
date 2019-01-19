import java.io.*;
public class Main
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws java.lang.Exception, IOException
    {
        String line=br.readLine();
        while(line!=null)
        {
            long n = Long.parseLong(line);
            long k = rec(n);
            System.out.println(k);
            line=br.readLine();
        }
    }
    public static long rec(long i)
    {
        if(i<12)
        {
            return i;
        }
        
        return rec(i/2)+rec(i/3)+rec(i/4);
    }
}