import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	private static final String SPACE = " ";
	private static final Pattern splitRegex = Pattern.compile(SPACE);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int s = Integer.parseInt(br.readLine());
			String[] strArr = splitRegex.split(br.readLine());
			int[][] moves = new int[4][s];
			for (int j = 0; j < s; j++) {
				moves[1][j] = Integer.parseInt(strArr[j]);
				moves[0][j] = j;
			}

			reorder(moves, 0, s - 1);
			print(moves, s);
		}
	}

	public static void print(int[][] moves, int size) {
		for (int i = 0; i < size; ++i) {
			moves[1][moves[0][i]] = i + 1;
		}
		for (int i = 0; i < size - 1; ++i) {
			System.out.print(moves[1][i] + SPACE);
		}
		System.out.println(moves[1][size - 1]);
	}

	public static void reorder(int[][] moves, int start, int end) {
		if (start < end) {
			int middle = (start + end) >> 1;
			reorder(moves, start, middle);
			reorder(moves, middle + 1, end);
			merge(moves, start, middle, end);
		}
	}

	public static void merge(int[][] moves, int start, int middle, int end) {
		int actualMiddle = middle + 1;
		int length = end - start + 1;
		int actualEnd = end + 1;
		int threshold = actualMiddle - start;
		System.arraycopy(moves[0], start, moves[2], start, length);
		System.arraycopy(moves[1], start, moves[3], start, length);

		int j = start, k = actualMiddle, i = start;
		while (j <= middle && k <= end) {
			int value = moves[3][k] - threshold;
			if (value >= moves[3][j]) {
				moves[0][i] = moves[2][k];
				moves[1][i] = value;
				++k;
			} else {
				moves[0][i] = moves[2][j];
				moves[1][i] = moves[3][j];
				++j;
				--threshold;
			}
			++i;
		}

		if (j <= middle) {
			System.arraycopy(moves[2], j, moves[0], i, actualMiddle - j);
			System.arraycopy(moves[3], j, moves[1], i, actualMiddle - j);
		} else if (k <= end) {
			System.arraycopy(moves[2], k, moves[0], i, actualEnd - k);
			System.arraycopy(moves[3], k, moves[1], i, actualEnd - k);
		}
	}
}