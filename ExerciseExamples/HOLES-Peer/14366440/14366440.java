import java.util.*;
import java.io.*;

class Codechef
{
    public static void main(String args[]) throws IOException
    {
        try
        {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         int T;
         String a;
         String str;
         char c;
         int count =0;
         T=Integer.parseInt(br.readLine());
         
         for(int j=0;j<T; j++)
         {
             a=br.readLine();
             str=a.toUpperCase();
             for(int i=0;i< str.length(); i++)
             {
                 c=str.charAt(i);
                 if(c =='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
                 count++;
                  
                 else if(c=='B')
                 count=count+2;
             }
             System.out.println(count);
            count=0;
                 
             }
         }
        
        
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}