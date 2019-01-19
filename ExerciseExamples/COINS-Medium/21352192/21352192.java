import java.util.Scanner;

 class byteland {

	public static void main(String[] args) {
		
		Scanner tc= new Scanner(System.in);
		
		while(tc.hasNextLong()) {
			long n=tc.nextLong();
			System.out.println(count(n));
		}
			
	}
	
	static long count(long n) {
		if(n/4+n/3+n/2 > n) {
			return count(n/4)+count(n/3)+count(n/2);
		}
		return n;
	}

}