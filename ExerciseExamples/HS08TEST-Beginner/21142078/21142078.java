import java.io.*;
import java.util.*;
class ATM {

	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in); 
		 int X = in.nextInt();
		 Double Y = in.nextDouble();
		 
		 if(X%5!=0)
			 System.out.println(Y);
		 
		 else if (X+0.50>Y)
			 System.out.println(Y);
		 else 
			 System.out.printf("%.2f",Y-X-0.50);
		 
		 
		 
		 
	}
}