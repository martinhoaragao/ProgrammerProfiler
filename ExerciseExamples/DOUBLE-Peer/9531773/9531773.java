import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palin {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	    int x,y,i; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    x =Integer.parseInt(br.readLine());
	    for(i=0;i<x;i++)
	    {
	    	y = Integer.parseInt(br.readLine());
	    	if(y % 2 == 0)
	    	System.out.println(y);
	    	else
	    	System.out.println(y-1);	
	    }
		
	
	}
	

}
