import java.util.*;
import java.lang.*;
import java.io.*;


class css
{
static long coin(long n){
		if(n<12)
		return n;
		return coin(n/2)+coin(n/3)+coin(n/4);
	}
	public static void main (String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int t=10;
	for(t=10;t>0;t--){
	long n=s.nextLong();
	System.out.println(coin(n));
	}
	}
}