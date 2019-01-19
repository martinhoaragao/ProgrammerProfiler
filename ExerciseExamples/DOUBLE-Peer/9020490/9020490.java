//java source code to sole the 'Double String' problem for palindrome length cases

import java.util.*;

class DoubleStrings
{
	//creating a Scanner object here
    Scanner scan = new Scanner(System.in);          
    
	//the method to check constraints and call the calculate_Length method 
	public void find_double_Strings()
	{               
		int test_case = scan.nextInt();
		
		
		if (test_case >= 1 && test_case <= 10000)
		{
			for(int i=0; i<test_case; i++)
			{
				int palindrome_Length = scan.nextInt();
				if(palindrome_Length >=1 && palindrome_Length <= 1000000000 )
				{
					//calling method here
					System.out.println(calculate_Length(palindrome_Length));
				}
			}
		}
		
	}
	
	//method to calculate the required length of double strings
	public int calculate_Length(int palindrome_Length)
	{
		if (palindrome_Length % 2 == 0)
			return palindrome_Length;
		else
			return palindrome_Length - 1;
	}
	
	public static void main(String anir[])
	{
		//creating the main object of class
        DoubleStrings ds = new DoubleStrings();
		//calling the initial method	
		ds.find_double_Strings();
	}
}