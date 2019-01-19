
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
       Scanner in=new Scanner(System.in);
	   int cash=in.nextInt();
	   float initial=in.nextFloat();
	   
	   if(cash+0.50<=initial &&cash%5==0){
		   
		   double remain=initial-(cash+0.50);
		   remain=remain+0.00;
		   System.out.printf("%.2f",remain);
		   
		 
	   }
	   else {
		   
		   System.out.printf("%.2f",initial);
		   
	  }
		     
	   }
}