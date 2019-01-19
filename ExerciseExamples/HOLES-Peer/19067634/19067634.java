import java.io.*;
import java.lang.*;
import java.util.*;
class Holes 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t;
		//System.out.println("Enter the no of test cases ");
		t=sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<t;i++)
		{
			String s ;
			//System.out.println("Enter the string of your choice ");
			s=sc.nextLine();
			int count = 0;
			for(int j = 0;j<s.length();j++)
			{
				
			        if(s.charAt(j)=='B')
				{
					count = count+2;
				}
			        else if(s.charAt(j)=='A'||s.charAt(j)=='D'||s.charAt(j)=='O'||s.charAt(j)=='P'||s.charAt(j)=='R'||s.charAt(j)=='Q')
				{
					count = count+1;
				}
				
			}
			System.out.println(count);
		}
		

	}

}
