/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		for (int t = 0; t < testCases; t++) {
			int nodes = sc.nextInt();
			int idSum = 0;
			int childSum = 0;
			for (int n = 0; n < nodes; n++) {
				idSum += sc.nextInt();
				childSum += sc.nextInt();
			}
			System.out.println(idSum - childSum);
		}

		sc.close();
	}
}