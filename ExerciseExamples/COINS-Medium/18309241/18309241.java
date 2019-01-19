import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class COINS {

	private static Map<Integer, Long> table = new HashMap<Integer, Long>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long ans = solve(n);
			System.out.println(ans);
		}
	}

	private static long solve(int n) {
		if (n < 12)
			return n;
		if (table.containsKey(n))
			return table.get(n);
		long max = solve(n / 2) + solve(n / 3) + solve(n / 4);
		table.put(n, max);
		return max;
	}
}
