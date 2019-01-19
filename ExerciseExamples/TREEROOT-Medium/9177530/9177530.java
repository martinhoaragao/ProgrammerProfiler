import java.io.*;

class TREEROOT {
	
	public static void main (String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int sum1 = 0, sum2 = 0;
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++){
				String[] s = br.readLine().split(" ");
				sum1+=Integer.parseInt(s[0]);
				sum2+=Integer.parseInt(s[1]);
			}
			System.out.println(sum1-sum2);
		}
		
	}


}