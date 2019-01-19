import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class COINS {
	
	static HashMap<Long, Long> memo = new HashMap<Long,Long>();
	
	static long calc_max(long n) {
		long max_value=0;
		
		if(memo.containsKey(n)) {
			//System.out.println("taking entry from memo, and value of key is "+n);
			return memo.get(n);
		}
		
		if(n<12) {
			//System.out.println("came in less than 12 section and value of n is "+n);
			max_value = n;
		}
		
		else {
			//System.out.println("came in main calculation part and value of n is "+n);
			max_value = calc_max(n/2) + calc_max(n/3) + calc_max(n/4);
		}
		
		memo.put( n , Math.max(n, max_value) );
		return max_value;
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(long i=0;i<12;i++) {
			memo.put(i, i);
		}
		
		int t=1;
		while(t++ <= 10) {
			long n = Long.parseLong(br.readLine());
			
			System.out.println(calc_max(n));
			
		}		
	}
}
