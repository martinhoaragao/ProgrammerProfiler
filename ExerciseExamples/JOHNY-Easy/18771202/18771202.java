import java.util.*;
class J
{
public static void main(String args[])
{
Scanner sc=new Scanner(System .in);
int t=sc.nextInt();
if(t>=1&&t<=1000)
{
for(int i=0;i<t;i++)
  {
   int n=sc.nextInt();
if(n>=1&&n<=100)
{
   int arr[]=new int[n];
   for(int j=0;j<n;j++)
      {
       arr[j]=sc.nextInt();
      }
      int k=sc.nextInt();
if(k>=1&&k<=100)
{
      int temp=arr[k-1];
      
      Arrays.sort(arr);
      for(int l=0;l<n;l++)
        {
          if(arr[l]==temp)
            {
             System.out.println(l+1);
             }
         }
   }
}
}
}
}
}