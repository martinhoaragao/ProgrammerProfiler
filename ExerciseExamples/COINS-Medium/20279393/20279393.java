import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
static long coin(long n){
		if(n<12)
		return n;
		return coin(n/2)+coin(n/3)+coin(n/4);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int t=10;
	while(t-->0){
	long n=s.nextLong();
	
		System.out.println(coin(n));
	}
	}
}