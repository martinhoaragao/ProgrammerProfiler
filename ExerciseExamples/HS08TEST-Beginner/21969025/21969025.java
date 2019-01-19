import java.util.*;
class Atm{
	public static void main(String args[]){
		double withdraw,totalBalance;
		Scanner s=new Scanner(System.in); 
		withdraw=s.nextDouble();
		totalBalance=s.nextDouble();
		
		if(totalBalance>=withdraw+0.5)
		{
    		 if(withdraw%5==0)
    		 {
    		totalBalance=totalBalance-withdraw-0.5;
    		System.out.printf("%.2f",totalBalance);
    		 }
		
    		else
    		{
    		System.out.printf("%.2f",totalBalance);
    		}
		}
	 	    else
    		{
    		System.out.printf("%.2f",totalBalance);
    		}
	}
}