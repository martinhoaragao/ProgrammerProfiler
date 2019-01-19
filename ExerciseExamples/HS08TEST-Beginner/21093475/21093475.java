import java.util.Scanner;
class atm
{
static double charges=0.50;


  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int x=sc.nextInt();
	  double y=sc.nextDouble();
	  if(x+charges<=y)
		{
		if(x>0 && x%5==0)
		{
			y=y-(x+charges);
		}
		}
		System.out.printf("%.2f",y);	
		
	  
  }
 

}