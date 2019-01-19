import java.util.*;
import java.io.*;
 class general{
	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintStream op = new PrintStream(System.out);
		//int T = s.nextInt();
		for(int t=0; t<10; t++){
		
		//while(s.hasNextLong()){
			long n = s.nextLong();
			op.println(get(n));
		}
	}
	public static long get(long n){
		if(n==0)
			map.put(n, n);
		if(map.containsKey(n)){
			return( map.get(n) );
		}
		long a = get(n/2) + get(n/3) + get(n/4);
		if( a > n)
			map.put(n, a);
		else
			map.put(n, n);
		return( map.get(n) );
	}
}