import java.util.*;

class ran {
	static long[] arr = new long[100000000];
	static long recursion(long n){
		if(n<=11)
			return n;
		if(n<100000000){
			if(arr[(int)n]!= 0){
				return arr[(int)n];
			}
			arr[(int)n] = Math.max(n, (recursion(n/2) +recursion(n/3)+recursion(n/4)));
			return arr[(int)n];
		}
		return Math.max(n, (recursion(n/2) +recursion(n/3)+recursion(n/4)));
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n = sc.nextLong();
			System.out.println(recursion(n));
		}
		
	}
}
