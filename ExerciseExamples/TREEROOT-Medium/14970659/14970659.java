import java.io.*;
import java.lang.*;
import java.util.*;
class ram
{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
   int n=sc.nextInt();
   int arr[]=new int[n];
   int count[]=new int[n];
   for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
     count[i]=sc.nextInt();
   }
   int c=0;
   int sum=0;
   for(int i=0;i<n;i++)
   {
      c=c+arr[i];
      sum=sum+count[i];
   }
   System.out.println(c-sum);
   }
 
 }
 
}