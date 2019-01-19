import java.util.*;
class johny
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in) ;
int tc=sc.nextInt();
for(int a=1;a<=tc;a++){
int noofsng=sc.nextInt();
long arr[]=new long[noofsng];
for(int b=0;b<arr.length;b++){
arr[b]=sc.nextInt();
}
int d=sc.nextInt();
long f=arr[d-1];
Arrays.sort(arr);
for(int c=0;c<arr.length;c++)
if(arr[c]==f)
System.out.println(c+1);
}
}
}