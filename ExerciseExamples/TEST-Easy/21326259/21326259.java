import java.util.Scanner;
class test{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
int num=sc.nextInt();
if(num!=42)
{System.out.println(num);}
else{
System.exit(0);
}

}

}
}