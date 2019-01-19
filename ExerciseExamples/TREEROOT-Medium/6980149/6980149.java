import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Read in from console */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int t = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<t; i++){
			
			int n = Integer.parseInt(reader.readLine());
			
			int sumId = 0;
			int sumChildren = 0;
			
			for(int j=0; j<n; j++){
				String[] data = reader.readLine().split("\\s");
				sumId += Integer.parseInt(data[0]);
				sumChildren += Integer.parseInt(data[1]);
			}
			
			writer.println(sumId - sumChildren);
		}
		
		writer.close();

	}

}
