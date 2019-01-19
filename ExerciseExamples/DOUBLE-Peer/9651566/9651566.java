import java.io.*;
class dou
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        if(t<=10000)
        {
            for(int z=1;z<=t;z++)
            {
                long n=Long.parseLong(br.readLine());
                if(n%2==0)
                System.out.println(n);
                else
                System.out.println(n-1);
            }
        }
    }
}