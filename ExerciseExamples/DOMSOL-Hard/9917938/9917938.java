/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.math.BigDecimal;
 

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static Scanner reader;
	public static void main (String[] args) throws java.lang.Exception
	{
		reader = new Scanner(System.in);
		int N;
	
		N = reader.nextInt();
			int [][] A = new int[2][100001];
		for(int i=0;i<2;i++)
		{
			for(int j=1;j<=N;j++)
			{
				A[i][j]=reader.nextInt();
			}
		}
		int _result[] = new int[100001];
		_result[0]=0;
		_result[1]=Math.abs(A[0][1]-A[1][1]);
		for(int i=2;i<=N;i++)
		{
			_result[i] = Math.max(_result[i-2]+
			Math.abs(A[0][i]-A[0][i-1])+Math.abs(A[1][i]-A[1][i-1]),
			_result[i-1]+Math.abs(A[0][i]-A[1][i]));
		}
		
		System.out.println(_result[N]);
		// your code goes here
	}
}

