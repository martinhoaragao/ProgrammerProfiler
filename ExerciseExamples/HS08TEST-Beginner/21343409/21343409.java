
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
double w = sc.nextDouble();
double b = sc.nextDouble();
if (w % 5 != 0){
System.out.println(b);
}
else if ((w+0.50) > b){
System.out.println(b);
}
else {
System.out.println((b-0.50)-w);
}
	}
}