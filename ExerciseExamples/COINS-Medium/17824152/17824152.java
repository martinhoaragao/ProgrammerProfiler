import java.util.Scanner;

class ByteCoin
{
	
	public static long calculate(long n)
	{
		long x=n/2+n/3+n/4;
		if(x<=n)
			return n;
		else return calculate(n/2)+calculate(n/3)+calculate(n/4);
	
		
		
		
	}
	
	
	
public static void main(String[] args)
{

Scanner scn=new Scanner(System.in);
while(scn.hasNext())
{
long n=scn.nextLong();
long x=calculate(n);
System.out.println(x);

}

scn.close();
}


}
