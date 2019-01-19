import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{

	public static HashMap<Long, Long> ans = new HashMap<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		int k = 0;
		while ((str = br.readLine()) != null) {
			try {
				long coin = Long.parseLong(str);
				System.out.println(exchange(coin));
				k++;
				if (k == 10) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}

	public static long exchange(long coin) {
		if (coin < 12) {
			return coin;
		} else {
			if (ans.containsKey(coin)) {
				return ans.get(coin);
			}
			long c1 = coin;
			long c21 = Math.max(coin / 2, exchange(coin / 2));
			long c22 = Math.max(coin / 3, exchange(coin / 3));
			long c23 = Math.max(coin / 4, exchange(coin / 4));

			long c2 = c21 + c22 + c23;
			long ret = Math.max(c1, c2);
			ans.put(coin, ret);
			return ret;
		}
	}
}
