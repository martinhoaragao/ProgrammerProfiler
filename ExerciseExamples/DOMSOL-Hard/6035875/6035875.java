// /cc/INOI/2015/Jan/ENTRY

import java.util.*;

class DominoSolitaire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_cols = sc.nextInt();
		
		int[][] domino = new int[2][n_cols];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < n_cols; j++)
				domino[i][j] = sc.nextInt();
		
		long[] scores = new long[n_cols + 1];
		scores[0] = 0;
		scores[1] = Math.abs(domino[0][0] - domino[1][0]);
		for (int i = 2; i <= n_cols; i++)
			scores[i] = Math.max(Math.abs(domino[0][i - 1] - domino[1][i - 1]) + scores[i - 1], 
								 Math.abs(domino[0][i - 1] - domino[0][i - 2]) + Math.abs(domino[1][i - 1] - domino[1][i - 2]) + scores[i - 2]);
		System.out.println(scores[n_cols]);
		sc.close();
	}
}