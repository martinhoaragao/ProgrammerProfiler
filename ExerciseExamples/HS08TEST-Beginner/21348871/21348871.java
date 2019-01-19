import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HS08TEST {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		int x = Integer.parseInt(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		
		if(x % 5 != 0 || x + 0.50 > y) {
			System.out.printf("%.2f\n", y);
		} else {
			System.out.printf("%.2f\n", y - (x + 0.5));
		}
		
		in.close();
	}

}
