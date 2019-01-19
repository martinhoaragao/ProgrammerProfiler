/* package whatever; // don't place package name! */

import java.util.Scanner;
 
class Double
{
 
	public static void main(String args[])
	{
	
		Scanner input = new Scanner(System.in);
 
	    int x = input.nextInt();
	    
	    
	    int y =0;
	   
	    for(int i =1;  i<=x; i++)
		{
	    	y = input.nextInt();
	    	
	        if (y== 0 || (y%2 ==0) )
	        System.out.println(y);
	        else
	        System.out.println(y-1);

}
} 
}