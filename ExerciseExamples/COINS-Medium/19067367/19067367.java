import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bytelandian_gold_coins {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {
			try {
				long coin = Long.parseLong(line);
				System.out.println(exchange(coin));
			} catch(Exception e) {
				break;
			}
		}
	}
	
	private static long exchange(long coin) {
		long c1 = coin / 2;
		long c2 = coin / 3;
		long c3 = coin / 4;
		long sum = c1+c2+c3;
		
		return (sum > coin) ? exchange(c1)+exchange(c2)+exchange(c3) : coin;
	}
}
