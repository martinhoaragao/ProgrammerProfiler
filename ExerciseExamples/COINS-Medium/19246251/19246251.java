import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Scratch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,Long> value = new HashMap<>();
		while (scan.hasNext()){
			int n = scan.nextInt();
			System.out.println(getMax(n,value));
		}
	}

	private static long getMax(int n,Map<Integer,Long> value) {
		if(n == 0){
			return 0;
		}
		if(value.containsKey(n)&&value.get(n)!=0){
			return value.get(n);
		}
		long res = Math.max(n,getMax(n/2,value) + getMax(n/3,value) + getMax(n/4,value));
		value.put(n,res);
		return res;
	}
}