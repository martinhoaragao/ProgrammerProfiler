
import java.io.*;
import java.math.*;
import java.util.*;

import javax.swing.ComboBoxEditor;

import java.lang.*;

class MyCode {

	public static void main(String[] args) throws IOException {

		// FastReader s = new FastReader(System.in);
		// Scanner s = new Scanner(System.in);

		InputStreamReader is = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(is);
		Scanner s = new Scanner(System.in);

		// String str1 = br.readLine();
		// int n = str1.charAt(0) - '0';
		// int k = str1.charAt(2) - '0';
		// HashMap<Integer, Boolean> map = new HashMap<>();
		// for (int i = 1; i <= n; i++) {
		// map.put(i, false);
		// }
		//
		// while (k-- > 0) {
		// String str = br.readLine();
		// if (str.equals("CLOSEALL")) {
		// for (int i = 1; i <= n; i++) {
		// map.put(i, false);
		// }
		// System.out.println("0");
		// } else {
		// int num = Integer.parseInt(str.charAt(str.length() - 1) + "");
		// map.put(num, !map.get(num));
		// int count = 0;
		// for (Boolean val : map.values()) {
		// if (val) {
		// count++;
		// }
		// }
		// System.out.println(count);
		// }
		// }

		// String str = br.readLine();
		// while (str != null) {
		// int n = Integer.parseInt(str);
		// System.out.println(coins(n, new int[n + 1]));
		// str=br.readLine();
		// }
		//
		// int i = 1;
		// String inputLine;
		// while (true) {
		// try {
		// int n = s.nextInt();
		// System.out.println(coins(n, new int[n + 1]));
		// } catch (Exception e) {
		// break;
		// }
		// }

		// while (s.hasNextInt()) {
		// int n = s.nextInt();
		// System.out.println(coins(n, new HashMap<Integer, Long>()));
		// }

		// int m=s.nextInt();
		// int n=s.nextInt();
		// System.out.println(domino(m, n));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String str = br.readLine();
			int count=0;
			for(int i=0;i<str.length();i++){
				count+=noOfHoles(str.charAt(i));
			}
			System.out.println(count);
		}
	}

	public static int domino(int m, int n) {
		if (m % 2 == 0 && n % 2 == 0) {
			return m * n / 2;
		} else if (m % 2 == 0) {
			return (m + 1) * (n / 2);
		} else if (n % 2 == 0) {
			return (n + 1) * (m / 2);
		} else {
			return m * (n / 2) + (m / 2);
		}

	}

	public static long coins(int n, HashMap<Integer, Long> map) {
		if (n == 0) {
			return n;
		}
		if (map.containsKey(n)) {
			return map.get(n);
		}
		long retval = Math.max(n, coins(n / 2, map) + coins(n / 3, map) + coins(n / 4, map));
		map.put(n, retval);
		return retval;
	}

	public static int noOfHoles(char ch) {
		switch (ch) {
		case 'B':
			return 2;
		case 'A':
		case 'D':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
			return 1;
		default:
			return 0;
		}
	}

}
