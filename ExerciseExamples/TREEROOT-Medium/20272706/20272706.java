import java.io.*;
import java.util.*;

class TreeRoot {
	
	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		PrintWriter out = new PrintWriter(System.out);
		
		int tc = in.nextInt();
		while(tc-- >0) {
			int n = in.nextInt();
			int id = 0;
			int sum = 0;
			
			while(n-->0) {
				id += in.nextInt();
				sum += in.nextInt();
			}
			out.println(id-sum);
			out.flush();
		}
	}
	
	// Fast IO class
	public static class InputReader {
		public BufferedReader reader;
        	public StringTokenizer tokenizer;
        	
        	public InputReader() {
	            	reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            		tokenizer = null;
        	}
        	
        	public String next() {
            		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                		try {
                    			tokenizer = new StringTokenizer(reader.readLine());
                		} catch (IOException e) {
                    			throw new RuntimeException(e);
                		}
            		}
            		return tokenizer.nextToken();
        	}
        
         	public int nextInt() {
            		return Integer.parseInt(next());
        	}
	}
}