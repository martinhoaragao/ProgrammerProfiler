import java.util.Scanner;
class Sam{
public static void main(String args[]){
int t;
Scanner in=new Scanner(System.in);
t = in.nextInt();
for(int i=0; i<t;i++)
{
int n = in.nextInt();
if(n%2 != 0)
System.out.println((n-1));
else
System.out.println(n);
}
}}