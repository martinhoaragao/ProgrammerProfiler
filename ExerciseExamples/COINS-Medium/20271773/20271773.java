import java.io.*;
import java.util.*;

class Coins {
	
	private static Map<Integer, Long> ansMap;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String val = null;
		ansMap = new HashMap<>();
		while((val =br.readLine())!=null){
			int n = Integer.parseInt(val);
			bw.write(getCoins(n)+"\n");
			bw.flush();
		}
	}
	public static Long getCoins(int n) {
		if(n==0) {
			return 0L;
		}
		
		if(!ansMap.containsKey(n)) {
			Long ans = Math.max(n, getCoins(n/2)+getCoins(n/3)+getCoins(n/4));
			ansMap.put(n, ans);
		}
		return ansMap.get(n);
	}
}