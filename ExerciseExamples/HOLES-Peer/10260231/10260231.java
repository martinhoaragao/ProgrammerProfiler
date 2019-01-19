import java.io.*;
import java.util.*;
class holes
{
 public static void main(String args[])throws IOException
 {
     BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
     int ln,i,j,l,h=0;
     String str;
     int t=Integer.parseInt(in.readLine());
     for(i=1;i<=t;i++)
     {
         str= in.readLine();
         str= str.toUpperCase();
         str= str.replaceAll("\\s+","");
         ln=str.length();
         for(j=0;j<ln;j++)
         {
             if(str.charAt(j)=='A'||str.charAt(j)=='D'||str.charAt(j)=='O'||str.charAt(j)=='P'||str.charAt(j)=='Q'||str.charAt(j)=='R')
             h=h+1;
             else if(str.charAt(j)=='B')
             h=h+2;
            }
         System.out.println(h);
         h=0;
        }
    }
}
