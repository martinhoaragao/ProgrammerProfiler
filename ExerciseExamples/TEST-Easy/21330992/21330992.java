/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	chef();
	}
	
    public static void chef(){
        Scanner scanner = new Scanner(System.in);
    	int n = 0;
    	while (n != 42) {
        	n = scanner.nextInt();
        	if(n!=42)System.out.println(n);    
    	}
    	scanner.close();  
    }
}
