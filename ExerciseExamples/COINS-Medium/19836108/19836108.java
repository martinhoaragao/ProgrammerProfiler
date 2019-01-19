import java.util.Scanner;

class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line;
		while(s.hasNext()) {
			long coinValue = s.nextLong();
			printMax(coinValue);
		}
	}
	
	private static void printMax(long coinValue) {
		long result = findMax(coinValue);
		System.out.println(result);
	}
	
	private static long findMax(long coinValue) {
		if(coinValue < 12) {
			return coinValue;
		}
		long halfValue = findMax(coinValue / 2);
		long thirdValue = findMax(coinValue / 3);
		long quarterValue = findMax(coinValue / 4);
		return Math.max(coinValue, halfValue + thirdValue + quarterValue);
	}
}