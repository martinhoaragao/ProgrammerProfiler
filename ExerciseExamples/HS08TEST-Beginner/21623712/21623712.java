            /* package whatever; // don't place package name! */
     
            import java.util.*;
            import java.lang.*;
            import java.io.*;
     
            /* Name of the class has to be "Main" only if the class is public. */
            class Ideone
            {
            	public static void main (String[] args) throws java.lang.Exception
            	{
            		Scanner sc = new Scanner(System.in);
     
            		double withdraw = sc.nextDouble();
            		double inAccount = sc.nextDouble();
            		sc.close();
     
            		if(multOfFive(withdraw) & enoughMoney(withdraw, inAccount)) System.out.println(inAccount - withdraw - 0.50);
            		else System.out.println(inAccount);
            	}
     
            	public static boolean multOfFive(double i) {
            		if(i%5 == 0) return true;
            		else return false;
            	}
     
            	public static boolean enoughMoney(double withdraw, double inAccount) {
     
            		if(inAccount >= withdraw + 0.50) return true;
            		else return false;
            	}
            }