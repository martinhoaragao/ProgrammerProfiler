import java.io.*;
import java.util.*;
class BINTREE
{
    public static void main(String args[])throws IOException
    {
        Scanner in= new Scanner(System.in);
        PrintWriter out= new PrintWriter(System.out);
        
        int i, j;
        long tc= in.nextLong();
        int n, id, sid;
        int sum;
        while(tc-->0)
        {
            sum=0;
            n= in.nextInt();
            for(i=0; i<n; i++)
            {
                id= in.nextInt();
                sid= in.nextInt();
                sum+=(id- sid);
            }
            out.println(sum);
            out.flush();
        }
        
        
    }
}