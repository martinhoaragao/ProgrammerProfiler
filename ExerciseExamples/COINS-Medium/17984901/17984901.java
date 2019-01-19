/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static ArrayList<Integer> al = new ArrayList<Integer>();
	public static void main (String[] args) throws java.lang.Exception
	{
	    createArray();
	    
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		    
		    int x = sc.nextInt();
		    System.out.println(answer(x));
		}
		
		
		
	}
	
	
	public static long answer(int x){
	    
	    if(x < al.size()) return al.get(x);
	    
	    return Math.max(x , answer(x/2)+answer(x/3)+answer(x/4));
	    
	}
	
	public static void createArray(){
	    
	    al.add(0);
	    
	    for(int i=1;i<1000005;++i){
	        
	        al.add(Math.max(i , al.get(i/2)+al.get(i/3)+al.get(i/4)));
	        
	        
	    }
	    
	    
	}
}

