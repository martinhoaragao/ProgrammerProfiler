import java.io.*;
import java.util.*;
class BINTREE
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(System.out);
        
        int i, j;
        StringTokenizer str= new StringTokenizer(br.readLine());
        int tc= Integer.parseInt(str.nextToken());
        int n, id, sid;
        int sum;
        
        while(tc-->0)
        {
            sum=0;
            str= new StringTokenizer(br.readLine());
            n= Integer.parseInt(str.nextToken());
            
            for(i=0; i<n; i++)
            {
                str= new StringTokenizer(br.readLine());
                id= Integer.parseInt(str.nextToken());
                sid= Integer.parseInt(str.nextToken());
                sum+=(id- sid);
            }
            out.println(sum);
            out.flush();
        }
        
        
    }
}