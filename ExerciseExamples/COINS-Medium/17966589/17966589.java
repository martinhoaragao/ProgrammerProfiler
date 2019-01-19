/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class COIN
{
	static long convert(long l){
		long ll = l/2+l/3+l/4;
		if(ll <= l)
			return l;
		return convert(l/2) + convert(l/3) + convert(l/4);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(convert(sc.nextLong()));
		}
	}
}