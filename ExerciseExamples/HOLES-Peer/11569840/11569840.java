import java.io.*;
import java.util.*;
class holes
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            String st=sc.next();
            int len=st.length();
            int count=0;
            for(int i=0;i<len;i++)
            {
                char ch=st.charAt(i);
                if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' || ch=='R')
                {
                    count+=1;
                }
                else if(ch=='B')
                {
                    count+=2;
                }
            }
             System.out.println(count);
        }
    }
}
                   