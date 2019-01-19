import java.util.*;
public class Main {

	static Hashtable<Long, Long> ht = new Hashtable();
	
	static long getMax(long n) {
		Long value = ht.get(n);
		if(value == null) {
			value = (long)n/2 + (long)n/3 + (long)n/4;
			if(value > n) {
				value = getMax((long)n/2) + getMax((long)n/3) + getMax((long)n/4);
				ht.put(n, value);
			}
			else {
				ht.put(n, n);
				value = n;
			}
		}
//		System.out.println(value);
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			System.out.println(getMax(s.nextLong()));
		}
	}

}
