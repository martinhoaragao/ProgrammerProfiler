import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int toWithdraw = scanner.nextInt();
		double accBalance = scanner.nextDouble();
		if ((toWithdraw % 5) == 0 && (accBalance - 0.5 - toWithdraw >=0)){
			accBalance -= 0.5 + toWithdraw;
		}
		
		System.out.println(accBalance);
	}
}