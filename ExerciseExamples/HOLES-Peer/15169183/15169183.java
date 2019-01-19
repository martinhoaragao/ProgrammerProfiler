/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    int holes = 0;
	    for(int i=0;i<t;i++){
	        holes=0;
	        String st = s.next();
	        for(int k=0;k<(st.length());k++){
	            if(st.charAt(k) == 'B'){
	                holes+=2;
	            }
	            else if(st.charAt(k) == 'A' || st.charAt(k) == 'D' || st.charAt(k) == 'O' || st.charAt(k) == 'P' || st.charAt(k) == 'Q' || st.charAt(k) == 'R'){
	                holes+=1;
	            }
	        }
	        System.out.println(holes);
	    }
	}
}
