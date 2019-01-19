import java.util.*;
class Test
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a,n,e,f,k=0,min;
    int arr[];
    a=sc.nextInt();
    for(int l=0;l<a;l++)
    {
       n=sc.nextInt();
       arr=new int[n];
       for(int j=0;j<n;j++)
       {
         arr[j]=sc.nextInt();
       }
       e=sc.nextInt(); 
       f=arr[e-1];
       min=0;
       for(int i=0;i<n;i++)
       {min=i;
        for(int j=i+1;j<n;j++)
        {
          if(arr[j]<arr[min])
          min=j;
        }
        k=arr[i];
        arr[i]=arr[min];
        arr[min]=k;
       }
       k=0;
       while(arr[k]!=f)
       {
         k++;
       }
       System.out.println(k+1); 
    }
 }
}