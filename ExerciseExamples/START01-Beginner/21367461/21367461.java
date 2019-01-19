import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class NUmberMirror {

	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(input.readLine());

		System.out.println(n);
	}
	}