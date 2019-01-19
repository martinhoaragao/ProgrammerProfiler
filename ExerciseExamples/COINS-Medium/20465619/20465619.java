import java.util.Scanner;
class COINS {
	public static void main(String[] args)throws Exception {
	
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{	
			long n=sc.nextLong();
			long finalV=COINS.sum(n);
			System.out.println(n>finalV?n:finalV);				
		}
	} 
	
	static long sum(long n) {
		long a=n/2;
		long b=n/3;
		long c=n/4;
		
		
		if(a+b+c>n) {
		return(sum(a)+sum(b)+sum(c));
		}
			else
			return n;
		}
}
