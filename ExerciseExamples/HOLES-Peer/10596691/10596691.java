/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());
        int i=0;
        for(i=0;i<test_cases;i++)
        {
            String input = br.readLine();
            int j=0;
            int count=0;
            for(j=0;j<input.length();j++)
            {
                char x = input.charAt(j);
                if(x == 'B')
                count = count+2;
                else if(x == 'A' || x == 'D' || x == 'O' || x == 'P' || x == 'Q' || x == 'R' )
                count = count+1;
            }
            System.out.println(count);
        }
	}
}
