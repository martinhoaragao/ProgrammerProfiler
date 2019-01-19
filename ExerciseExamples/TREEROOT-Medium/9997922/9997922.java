import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class TreeRoot{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			int total = 0;
			for(int i=0;i<n;i++){
				String[] input = br.readLine().split(" ");
				total += (Integer.parseInt(input[0])-Integer.parseInt(input[1]));
			}
			pw.println(total);
		}
		pw.flush();
		pw.close();
	}
}