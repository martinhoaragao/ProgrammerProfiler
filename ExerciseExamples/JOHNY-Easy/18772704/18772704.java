

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
public static void main(String[] args)
{
	Scanner one = new Scanner(System.in);
	
	int T = one.nextInt();
	int [] array = new int[T];
	for(int i=0;i<T;i++)
	{
		int N = one.nextInt();
		
		ArrayList<Integer> two = new ArrayList<Integer>();
		two.add(0);
		for(int k =1;k<=N;k++)
		{
			int A = one.nextInt();
			two.add(A);
		}
		int K = one.nextInt();
		
		int in = two.get(K);
		
		Collections.sort(two);
		
		int fn = two.indexOf(in);
		
		array[i]= fn;
		
		
	}
	
	for(int o:array)
	{
		System.out.println(o);
	}
	one.close();
	
}
}
