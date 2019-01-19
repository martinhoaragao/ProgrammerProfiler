
import java.io.*;
class Codechef
{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(obj.readLine());
        int j;
        while(t>0)
        {
        String s=obj.readLine();
        int sum=0;
        for(j=0;j<s.length();j++)
        {
          if(s.charAt(j)=='A'||s.charAt(j)=='D'||s.charAt(j)=='O'||s.charAt(j)=='P'||s.charAt(j)=='R'||s.charAt(j)=='Q')
          sum++;
          else if(s.charAt(j)=='B')
              sum=sum+2;
          
          
        }
        System.out.println(sum);
        t--;
        }
    }
}