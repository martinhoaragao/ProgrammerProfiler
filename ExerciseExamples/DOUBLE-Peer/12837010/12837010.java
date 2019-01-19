import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		while(T>0)
		{
			int N;
			N=sc.nextInt();
			if(N%2==0)
				System.out.println(N);
			else
				System.out.println(N-1);
			T--;
		}
	}
}