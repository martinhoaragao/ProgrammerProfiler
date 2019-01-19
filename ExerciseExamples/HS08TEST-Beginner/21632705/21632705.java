

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextFloat();
		if(x>y){
			System.out.printf("%.2f",y);
		}
		else
		{
			if(x%5==0 && y-x>=0.5){
				System.out.printf("%.2f",y-(x+0.5));
			}
			else{
				System.out.printf("%.2f",y);
			}
		}
	}
}