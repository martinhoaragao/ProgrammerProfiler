import java.io.*;
import java.util.Scanner;
class Program
{
public static void main(String args[])
{
	int X;
	double Y,Z;
	Scanner sc= new Scanner(System.in);
	X=sc.nextInt();
	Y=sc.nextFloat();
	Z=X+0.50;
	if(X%5==0 && Z<=Y)
		{
			Y=Y-Z;
		}
	System.out.println(Y);
}
}