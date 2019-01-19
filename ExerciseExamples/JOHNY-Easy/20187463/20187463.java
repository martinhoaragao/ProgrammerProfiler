import java.util.*;
class uj
{
public static void main(String args[])
{int t,n,k,a,i;
Scanner in=new Scanner(System.in);
t=in.nextInt();
while (t-->0)
{n=in.nextInt();
 int arr[]=new int[n];
 for(i=0;i<n;i++)
 { arr[i]=in.nextInt();}
 k=in.nextInt();
 a=arr[k-1];
 Arrays.sort(arr);
 for(i=0;i<n;i++)
 {if(arr[i]==a)
 {System.out.println((i+1));
 break;}
 }
 }
 }
 }
 
 
 