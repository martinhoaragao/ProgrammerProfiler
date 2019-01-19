import java.util.*;
class j
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int tc=sc.nextInt();
     for(int t=1;t<=tc;t++)
     {
     int n=sc.nextInt();
     int ar[]=new int[n];
     for(int i=0;i<n;i++)
     ar[i]=sc.nextInt();
     int m=sc.nextInt();
     int u=ar[m-1];
     Arrays.sort(ar);
     System.out.println(Arrays.binarySearch(ar,u)+1);
         
        }
    }
}