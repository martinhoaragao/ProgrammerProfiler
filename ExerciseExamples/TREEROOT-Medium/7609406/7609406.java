import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(
				System.out));
		int t = Integer.parseInt(br.readLine());
		for (int a = 0; a < t; a++) {
			int n = Integer.parseInt(br.readLine());
			int ids = 0, idc = 0;
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				ids = ids + Integer.parseInt(st.nextToken());
				idc = idc + Integer.parseInt(st.nextToken());
			}
			int root = ids - idc;
			log.write(root + "\n");
		}
		log.flush();
		System.exit(0);
	}
}