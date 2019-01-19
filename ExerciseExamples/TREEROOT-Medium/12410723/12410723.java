import java.util.*;
 class Treeroot{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int t= sc.nextInt();
while(t!=0)
{
int sum =0;
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int a=sc.nextInt();
int b=sc.nextInt();
sum=+sum+(a-b);
}
System.out.println(sum);
t--;
}
}
 } 