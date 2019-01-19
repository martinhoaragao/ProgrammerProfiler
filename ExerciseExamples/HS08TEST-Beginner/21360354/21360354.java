import java.util.Scanner;
class ATM
{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
     	int  cre=sc.nextInt();
	   double am=sc.nextFloat();
	   if((am>cre+0.5) && (cre%5==0) )
	     am=((am-cre)-0.5);
	   System.out.print(am);
	    
	}
}