import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)  throws IOException
	{ 
	   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++) {
	        String s=new String();
	        int holes=0;
	        s=br.readLine();
	        for(int j=0;j<s.length();j++) {
	            if(s.charAt(j)=='A'|| s.charAt(j)== 'D' || s.charAt(j)=='O' || s.charAt(j)=='P'|| s.charAt(j)=='R'||s.charAt(j)=='Q') 
	                holes=holes+1;
	           if( s.charAt(j)=='B')
	            holes=holes+2;
	            
	        }
	        System.out.println(holes);
	    }
	}
}
	        
	        
	        
	        