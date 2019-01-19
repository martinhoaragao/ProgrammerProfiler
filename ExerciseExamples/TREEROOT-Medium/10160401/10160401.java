/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean checkpalin(String s)
    {
        int n=s.length();
        int left=0;
        int right=n-1;
        
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            
            
            int suml=0,sumr=0;
            
            for(int i=0;i<n;i++)
            {
                String s[]=br.readLine().split(" ");
                suml+=Integer.parseInt(s[0]);
                sumr+=Integer.parseInt(s[1]);
            }
            
            out.println(suml-sumr);
            
        }
	  
	   
	    
	   
	    out.flush();
	    out.close();
		// your code goes here
	}
}
