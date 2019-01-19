//import java.util.InputMismatchException;
import java.util.Scanner;
 class ATM{
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//public static void main(String []args){
	double a=atm();
	System.out.print(a);
	System.out.println(0);
}
public static double atm()
{
	Scanner s=new Scanner(System.in);
	double X=s.nextInt();
	double Y=s.nextDouble();
	if(X>Y)
	{
	 return Y;       
	}
		else
		{
		if(X%5==0&&Y>=X+0.5)
		{
			    Y-=X;
				Y-=0.5;
				double x=(double)Y;
				return x;
			
		
		}
		else
		{
		double a=(double)Y;
		return a;
		}
		}
	
}

}
