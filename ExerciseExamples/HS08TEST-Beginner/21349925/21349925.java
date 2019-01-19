import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    double bal, amt;
	    amt = in.nextDouble();
	    bal = in.nextDouble();
	    //amt -= 0.5;
	    double ba = bal - 0.5;
	    if(amt > ba) 
	        System.out.printf("%.2f", bal);
	    else if(amt % 5 == 0){
	        ba -= amt;
	        System.out.printf("%.2f", ba);
	    }
	    else System.out.printf("%.2f", bal);
	    in.close();
	}
}
