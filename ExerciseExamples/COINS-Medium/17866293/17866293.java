


import java.util.HashMap;
import java.util.Scanner;

class COINS {
	
	static final int limit = 1000000001;
	static HashMap<Long, Long> arr = new HashMap<>();
	
	public static void main(String args[]) {
		
		arr.put(0L, 0L);
		arr.put(1L,1L);
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			
			long num = sc.nextLong();
			calculateRecursiveSum(num);
			
			System.out.println(arr.get(num));
			
		}
		
		sc.close();
	}
	
	public static void calculateRecursiveSum(long num ) {
		
		if(num == 0 || num == 1) {
			return ;
		}
		long byTwo = num/2;
		long byThree = num/3;
		long byFour = num/4;
		
		if(arr.get(byTwo) == null) {
			calculateRecursiveSum(byTwo);
		}
		if( arr .get(byThree) == null) {
			calculateRecursiveSum(byThree);
		}
		if( arr .get(byThree) == null) {
			calculateRecursiveSum(byFour);
		}
		long extendedSum = arr.get(byTwo) + arr.get(byThree) + arr.get(byFour);
		if(num < extendedSum) {
			arr.put(num, extendedSum);
		}else {
			arr.put(num, num);
		}
	}

}
