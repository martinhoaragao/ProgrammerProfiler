/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	double a=s.nextDouble();
	double ans=0;
	if((n+0.5)>a||n%5!=0)
	System.out.printf("%.2f\n",a);
	else
	System.out.printf("%.2f\n",a-((double)n+0.5));
}
}