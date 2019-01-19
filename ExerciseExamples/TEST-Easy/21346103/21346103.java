import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=0;
while(true)
{
 a=sc.nextInt();
if(a==42)
break;
System.out.println(a);

}
}
}