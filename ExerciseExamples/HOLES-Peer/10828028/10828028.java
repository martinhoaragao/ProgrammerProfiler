//Holes

import java.util.*;

class Main
{
	public static void main(String args[])
	{
	try
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++)
		{
			String str = sc.next();
			char arr[] = str.toCharArray();
			int n = arr.length;
			int count = 0;
			for (int j=0; j<n; j++)
			{
				if (arr[j]=='A'||arr[j]=='D'||arr[j]=='O'||arr[j]=='P'||arr[j]=='Q'||arr[j]=='R')
					count+=1;
				else if(arr[j]=='B')
					count+=2;
				else
					continue;
			}
			System.out.println(count);
		}
	}
	catch(Exception e)
	{
		return;
	}
	}
}
