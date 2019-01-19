import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// System.out.println(func(1,3,100));
		try {

			// System.out.println(isPalin("ABDCBA"));
			// System.out.println(isPrime(13,12));
			// System.out.println(isPrime(10,9));

			// final BufferedInputStream br = new
			// BufferedInputStream(System.in);
			final BufferedReader br = new BufferedReader(
					new java.io.InputStreamReader(System.in));
			final PrintWriter bw = new PrintWriter(new BufferedOutputStream(
					System.out));
			// int T = inputIntger(br);

			int T = Integer.parseInt(br.readLine());
			for (int k = 0; k < T; k++) {
				int totalSum = 0;
				int N = Integer.parseInt(br.readLine());
				for (int i = 0; i < N; i++) {
					String[] no = br.readLine().split(" ");
					int node = Integer.parseInt(no[0]);
					int sum = Integer.parseInt(no[1]);
					totalSum=totalSum+node-sum;
					// int N = Integer.parseInt(no[0]);
					// int K = Integer.parseInt(no[1]);
					// // int sLim=Integer.parseInt(no[2]);
					// // int eLim=Integer.parseInt(no[3]);
					// String str = br.readLine();
					// int count = 0;
					// for (int i = 0; i < str.length(); i++) {
					// if (str.substring(i, i + 1).equals("G")) {
					// //i++;
					// continue;
					// } else {
					// String newStr = "";
					// count++;
					// for (int j = 0; j < str.length(); j++) {
					// if (j >= i && j < i + K) {
					// if (!str.substring(j, j + 1).equals("G")) {
					// newStr += "G";
					// } else
					// newStr += "R";
					// } else {
					// newStr += str.substring(j, j + 1);
					// }
					// }
					//
					// str = newStr;
					// }
					//
				}

				// int N=Integer.parseInt(no[0]);
				// int D=Integer.parseInt(no[1]);
				// String[] frame=br.readLine().split(" ");
				// String[] frameCost=br.readLine().split(" ");
				// //int N=Integer.parseInt(br.readLine());
				// int N=inputIntger(br);
				// int s=inputIntger(br);
				bw.println(totalSum);
				// }
				// else

				// bw.println(count1);
				// System.out.println(count);
			}
			bw.flush();
			// int M=N;
			// while(true)
			// {
			// if(isPalin(String.valueOf(N)))
			// {
			// if(IsPrime(N))
			// break;
			// }
			// M=++N;
			// }
			// bw.println(M);
			// for (int p = 0; p < testCase; p++) {
			// int N = inputIntger(br);
			// int[] data = new int[N];// reader.readLine().split(" ");
			// for (int i = 0; i < N; i++)
			// data[i] = inputIntger(br);
			//
			// int[] count = new int[10000];
			//
			// for (int i = 0; i < data.length; i++) {
			// count[(data[i]) - 1] += 1;
			// }
			// int max = 0;
			// int val = 0;
			// for (int i = 0; i < count.length; i++) {
			// if (max < count[i]) {
			// max = count[i];
			// val = i + 1;
			// }
			// }
			// bw.println(val + " " + max);
			// // ListCombination(data.toString());
			// }
			bw.flush();
			// }

			// display(head);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isPalin(String s) {
		int N = s.length();
		for (int i = 0; i < N / 2; i++) {
			if (s.charAt(i) != s.charAt(N - i - 1)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime(int N, int x) {
		if (x == 1)
			return true;
		if (N % x == 0)
			return false;
		else
			return isPrime(N, x - 1);
	}

	public static boolean IsPrime(int number) {
		if (number < 2)
			return false;
		if (number % 2 == 0)
			return (number == 2);
		int root = (int) Math.sqrt(number);
		for (int i = 3; i <= root; i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	private static int inputIntger(BufferedInputStream br) throws IOException {
		int num = 0, b;
		boolean minus = false;
		while ((b = br.read()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = br.read();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = br.read();
		}
	}

}
