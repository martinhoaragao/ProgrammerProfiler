
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			char [] c = br.readLine().toCharArray();
			int ret =0;
			for (int j = 0; j < c.length; j++) {
				if (c[j] == 'A' || c[j] == 'D' || c[j] == 'O' || c[j] == 'P' || c[j] == 'R' || c[j] == 'Q') {
					ret+=1;
				} if (c[j] == 'B'){
					ret+=2;
				}
			}
			System.out.println(ret);
		}

	}

}