import java.util.*;
class Solution{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(--t>=0)
{
 int n=sc.nextInt();
 long a[]=new long[n];
 for(int i=0;i<n;i++)
  a[i]=sc.nextInt();
 int k=sc.nextInt();
 long j=a[k-1];
 Arrays.sort(a);
 for(int i=0;i<n;i++)
 {
  if(a[i]==j)
   System.out.println(i+1);
 }
}
}
}