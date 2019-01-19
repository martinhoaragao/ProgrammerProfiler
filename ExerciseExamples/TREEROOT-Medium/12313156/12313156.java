import java.util.Scanner;
class TREEROOT
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();int x,y,sum;
while(t-->0)
{sum=0;
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
 x=sc.nextInt();
 y=sc.nextInt();
 sum=sum+x-y;
 }
 System.out.println(sum);
 }
 }
 }