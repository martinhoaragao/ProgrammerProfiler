//import java.io.BufferedReader;
//import java.io.EOFException;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	static HashMap<Long, Long> hm = new HashMap<Long, Long>();
	
	public static void main(String args[]) throws IOException{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			long n = scanner.nextLong();
			hm.put(0L, 0L);
			System.out.println(maxValue(n));
		}
	}
	
	public static long maxValue(long value){
		if(hm.containsKey(value)){
			return hm.get(value);
		}
		else{
			long max = Math.max(value, maxValue(value/2)+maxValue(value/3)+maxValue(value/4));
			hm.put(value, max);
			return max;
		}
	}
	
	
}
