import java.io.*;
class HOLES
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        int count=0;
        int t=Integer.parseInt(b.readLine());
        while(t!=0)
        {
            count=0;
            String s=b.readLine();
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='A'||c=='D'||c=='O'||c=='P'||c=='R'||c=='Q')
                     count+=1;
                else
                if(c=='B')
                    count+=2;
                else
                    continue;
            }
            System.out.println(count);
            t--;
        }
        
    }
}