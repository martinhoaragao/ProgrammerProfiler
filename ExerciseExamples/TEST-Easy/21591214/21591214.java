import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TEST {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		do {
			n = Integer.parseInt(br.readLine());
			if(n!=42)
			System.out.println(n);
		}
		while(n!=42);
	}
}
