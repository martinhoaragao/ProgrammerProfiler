import java.io.*;
import java.util.Scanner;
class number42{
		public static void main (String args[])
		{
			//System.out.println("enter a number");
			Scanner scanner = new Scanner(System.in);
			do{
			int num=scanner.nextInt();
			int i=num;

				if(i==42)
				{
				break;
				}
				else
				{
				System.out.println(+i);
				}
			}while(true);
		}

}
