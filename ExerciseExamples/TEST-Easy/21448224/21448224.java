import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// import java.util.Scanner;


class Main {


	public static void main(String args[]) throws Exception {
		// final Scanner sc = new Scanner(System.in);
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ip = br.readLine();
		while(!ip.equals("42")) {
			bw.write(ip+"\n");
			ip = br.readLine();
		}

		bw.close();
	}
}