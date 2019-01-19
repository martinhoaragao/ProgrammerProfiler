import java.io.*;

class DoubleStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			int input = Integer.parseInt(br.readLine());
			if(input % 2 != 0) pw.println(input-1);
			else pw.println(input);
		}
		pw.flush();
		pw.close();
	}
}