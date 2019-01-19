import java.io.*;
class Holes
{
    private static int h[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
    public static void main (String[] args)throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
            String s=br.readLine();
            int sum=0;
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                sum+=h[c-65];
            }
            System.out.println(sum);
        }
    }
}