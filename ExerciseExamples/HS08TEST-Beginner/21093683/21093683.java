import java.util.Scanner;


class atm
{
double charges=0.50;
void withdraw(double x,double y)
{
	if(x+charges<=y)
	{
	if(x>0 && x%5==0)
	{
		y=(y-x)-charges;
	}
	}
	System.out.printf("%.2f",y);	
	

}

  public static void main(String args[])
  {
	  
	  Scanner sc=new Scanner(System.in);
	  double a=sc.nextDouble();
	  double b=sc.nextDouble();
	  atm user=new atm();
	  user.withdraw(a,b);
	  
  }
 

}