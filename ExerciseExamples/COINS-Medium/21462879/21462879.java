import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		while(line != null) {
			line.replaceAll(" ","");
			System.out.println(dollars(Long.parseLong(line)));
			line = in.readLine();
		}
		in.close();
	}

	private static long dollars(long l) {
		long t = (l/4) + (l/3) + (l/2);
		if(t <= l)
			return l;
		return dollars(l/4) + dollars(l/3) + dollars(l/2);	
	}
}