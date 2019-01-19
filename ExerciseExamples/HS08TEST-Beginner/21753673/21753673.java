import java.util.*;
class ATM
{

static void display(double n)
{
System.out.println(String.format("%.2f", n));
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
double y=sc.nextDouble();




if(x>y-.5)
{
display(y);
}
else if(x%5!=0)
{display(y);}
else{
y=y-x-0.50;
display(y);
}

}
}
