/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		HashMap<Integer,Integer> lookup=new HashMap<>();
		lookup.put((int)'A',1);
		lookup.put((int)'B',2);
		lookup.put((int)'C',0);
		lookup.put((int)'D',1);
	    lookup.put((int)'E',0);
	    lookup.put((int)'F',0);
	    lookup.put((int)'G',0);
	    lookup.put((int)'H',0);
	    lookup.put((int)'I',0);
	    lookup.put((int)'J',0);
	    lookup.put((int)'K',0);
	    lookup.put((int)'L',0);
	    lookup.put((int)'M',0);
	    lookup.put((int)'N',0);
	    lookup.put((int)'O',1);
	    lookup.put((int)'P',1);
	    lookup.put((int)'Q',1);
		lookup.put((int)'R',1);
		lookup.put((int)'S',0);
		lookup.put((int)'T',0);
	    lookup.put((int)'U',0);
	    lookup.put((int)'V',0);
	    lookup.put((int)'W',0);
	    lookup.put((int)'X',0);
	    lookup.put((int)'Y',0);
	    lookup.put((int)'Z',0);
	    
		
		int t=in.nextInt();
		for(int X=0;X<t;X++)
		{
			int total=0;
			String f=in.next();
			for(int i=0;i<f.length();i++)
			{
				total+=lookup.get((int)f.charAt(i));
			}
			System.out.println(total);
		}
	}
}