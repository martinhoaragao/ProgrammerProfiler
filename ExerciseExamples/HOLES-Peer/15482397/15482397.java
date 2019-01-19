import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n= scan.nextInt();
      int a,sum=0;
      String s;
      
      char[] b={'A','D','O','P','Q','R'};
     
      for(int i=0;i<n;i++)
      {
          s=scan.next();
         
         
         for(int j=0;j<s.length();j++)
         {
              if(s.charAt(j)=='B')
         sum=sum+2;
             for(int k=0;k<b.length;k++)
{
         if(s.charAt(j)==b[k])
         sum++;
        
      }
}
        System.out.println(sum);
        sum=0;
    }
}
}