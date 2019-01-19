import java.util.*;
class doub
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int j=0;j<t;j++)
{
int n=sc.nextInt();
if(n%2==0)
System.out.println(n);
else
System.out.println(n-1);
}
}
} 