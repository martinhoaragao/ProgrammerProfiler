/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		    num = sc.nextInt();
		    if(num == 42)
		        break;
		    System.out.println(num);
		}
	}
}