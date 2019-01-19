import java.util.*;

public class Main
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();

for(int i=0;i<t;i++)
{

int l = sc.nextInt();

if(l%2==0)
System.out.println(l+"");
else
System.out.println(l-1+"");

}


}}