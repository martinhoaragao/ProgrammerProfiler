import java.util.*;
class Johny
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int T=sc.nextInt();
  while(T-->0)
  {
   int N=sc.nextInt();
   int arr[]=new int[N];
   for(int i=0;i<N;i++)
    arr[i]=sc.nextInt();
   int k=sc.nextInt();
   int x=arr[k-1];
   Arrays.sort(arr);
   int l=0;
   int r=N-1;int pos=0;
    while (l <= r) 
    { 
        int m = l + (r-l)/2; 
  
        // Check if x is present at mid 
        if (arr[m] == x) 
            pos=m;
  
        // If x greater, ignore left half 
        if (arr[m] < x) 
            l = m + 1; 
  
        // If x is smaller, ignore right half 
        else
            r = m - 1; 
    } 
    System.out.println(pos+1);
   }
 }
}