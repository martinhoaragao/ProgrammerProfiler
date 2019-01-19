import java.io.*;
import java.util.*;
class ATM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Withdrawal amount...");
		int with=sc.nextInt();
		//System.out.println("Enter the balance...");
		float bal=sc.nextFloat();
		if(with%5==0 && with <=(bal-0.5))
		System.out.println(bal-0.5-with);
		else if(with%5!=0)
		System.out.println(bal);
		else
		System.out.println(bal);
	}
}