import java.io.BufferedReader;
import java.io.InputStreamReader;

class TREEROOT {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while (T >= 1 && T <= 50) {
				int sum =0;
				int N = Integer.parseInt(br.readLine());
				while (N > 0) {
					String[] temp = br.readLine().split(" ");
					sum += Integer.parseInt(temp[0].trim()) - Integer.parseInt(temp[1].trim());
					N--;
				}
				System.out.println(sum);
				T--;
			}			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
