import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


class TREEROOT {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out,true);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine().trim());
			int sum1 =0;
			int sum2 = 0;
			for (int i = 0; i < n; i++) {
				String s[] = br.readLine().split("\\s+");
				sum1+= Integer.parseInt(s[0]);
				sum2+= Integer.parseInt(s[1]);
			}
			pw.println(sum1 - sum2);
		}
		pw.flush();
	}
}
