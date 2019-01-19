import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class d 
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i1=0;i1<t;i1++)
      {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();}
        int k=sc.nextInt();
        int s=a[k-1];
        Arrays.sort(a);
        int y=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
            y=i;
            break;
            }            
        }
        System.out.println(y+1);

      }
      
      sc.close();
      
  }
}