import java.util.*;
class A{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
     int n= sc.nextInt();
     int arr[] = new int[n+1];
     for(int i=1;i<=n;i++)
        arr[i]= sc.nextInt();
      int k= sc.nextInt();
        int c= arr[k];
       int count=0;
       for(int i=1;i<=n;i++)
       {
         if(arr[i]<c)
         count++;}
         System.out.println(++count);}}} 
  
   