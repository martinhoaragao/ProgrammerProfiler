import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class root
{
 public static void main(String arg[])
 {
  int sum,n,node,root=0;
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t>0)
  {
   n=sc.nextInt();
   root=0;
   while(n>0)
   {
   node=sc.nextInt();
   sum=sc.nextInt();
   root=root+node-sum; 
   n--;   
   }
   System.out.println(root);
   t--;
  }
 }
}