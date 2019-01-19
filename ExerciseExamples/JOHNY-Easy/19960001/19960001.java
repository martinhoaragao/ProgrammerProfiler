import java.util.*;

class Lue{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 for(int i=0;i<t;i++)
 {
  int n=sc.nextInt();
  int arr[]=new int[n];
  int j; 
  for(j=0;j<n;j++)
  {
    arr[j]=sc.nextInt();
  }
  int k=sc.nextInt();
  int uncle=arr[k-1];
 for(int m=0;m<n;m++)
  for( j=1;j<n;j++)
  {
   if(arr[j-1]>arr[j])
   {
    int temp=arr[j-1];
    arr[j-1]=arr[j];
    arr[j]=temp;
   } 
  }
  for(j=0;j<n;j++)
  {
    if(arr[j]==uncle)
     System.out.println(j+1);
  }
 }
}
}