import java.util.Scanner;
class johny{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int T,t,n,i,m,k,x,j,f=0,temp;

T=in.nextInt(); 
for(t=0;t<T;t++){
n=in.nextInt();
int arr[];
arr=new int[n];
for(i=0;i<n;i++)
arr[i]=in.nextInt();
k=in.nextInt();
x=arr[k-1];
for(j=n;j>1;j--){
for(i=0;i<j-1;i++)
{
 if(arr[i]>arr[i+1])
 {temp=arr[i];
 arr[i]=arr[i+1];
 arr[i+1]=temp;
 }
}
}
for(i=0;i<n;i++)
{
if(arr[i]==x)
f=i+1;
}
System.out.println(f);
}
}
}