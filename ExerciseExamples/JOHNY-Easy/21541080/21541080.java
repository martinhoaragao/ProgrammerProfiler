import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
		int t=Integer.parseInt(in.nextLine());
	    
	    for (int i=0; i<t; i++)
	    {
    	    
    		int n=Integer.parseInt(in.nextLine());
    	    String[] elements=in.nextLine().split(" ");
    	    int k=Integer.parseInt(in.nextLine());
    	    int kvalue=Integer.parseInt(elements[k-1]);
    	    
    	    int f=1;
    	    for (String s:elements)
    	    {
    	    if (Integer.parseInt(s)<kvalue)
    	    f++;
    	    }
    	    
    	    System.out.println(f);
    	    
	    }
	    
	    
	}
}
