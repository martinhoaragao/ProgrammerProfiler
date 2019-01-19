/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String args[]){
		InputReader in = new InputReader(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt(), arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = in.nextInt();
			int k = in.nextInt(), ele = arr[k-1], result = 0;
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++){
				if(arr[i] == ele)result = i+1;
			}
			System.out.println(result);
		}
	}
	
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
