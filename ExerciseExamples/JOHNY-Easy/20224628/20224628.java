import java.util.Scanner;
import java.util.Arrays;
class john{
public static void main(String args[]){
int t;int k,n;long song;int i;
Scanner cin=new Scanner(System.in);
t=cin.nextInt();
while(t-->0)
{
n=cin.nextInt(); long arr[]=new long[n];
for( i=0; i<n; i++)
arr[i]=cin.nextInt();
k=cin.nextInt();
song=arr[k-1];
Arrays.sort(arr);
for(i=0; i<n; i++)
{
if(song==arr[i]){
System.out.println(i+1); break;}

}


}



}}