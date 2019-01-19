import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;

class BytelandianCoins{

	static long change(long n, HashMap<Long, Long> map1) {
		if(n == 0)
			return 0;
		if(map1.get(n) == null)
			map1.put(n, Math.max(n, change(n/2, map1)+change(n/3, map1)+change(n/4, map1)));
		return map1.get(n);
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		long n;
		HashMap<Long, Long> map1 = new HashMap<>();
		while(s.hasNextLong()){
			n = s.nextLong();
			System.out.println(""+change(n, map1));
		}
	}
}