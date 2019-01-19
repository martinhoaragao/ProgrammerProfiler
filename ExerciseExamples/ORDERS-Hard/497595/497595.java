import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(new BufferedOutputStream(
				new FileOutputStream(FileDescriptor.out), 200000 * 64), false));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfCases = Integer.parseInt(br.readLine());
		StringTokenizer tokenizer = null;
		final int[][] moves = new int[4][200000];
		while (noOfCases-- > 0) {
			int size = Integer.parseInt(br.readLine());
			tokenizer = new StringTokenizer(br.readLine(), " ");
			int k = 0;
			while (tokenizer.hasMoreTokens()) {
				moves[0][k] = k;
				moves[1][k++] = Integer.parseInt(tokenizer.nextToken());
			}

			--size;
			reorder(moves, 0, size);

			for (int j = 0; j <= size; ++j) {
				moves[1][moves[0][j]] = j + 1;
			}
			for (int j = 0; j < size; ++j) {
				System.out.print(moves[1][j] + " ");
			}
			System.out.println(moves[1][size]);
		}
		System.out.flush();
	}

	public static void reorder(int[][] moves, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) >> 1;
			reorder(moves, startIndex, middleIndex);
			reorder(moves, middleIndex + 1, endIndex);
			merge(moves, startIndex, middleIndex, endIndex);
		}
	}

	public static void merge(int[][] moves, int start, int middle, int end) {
		++middle;
		++end;
		System.arraycopy(moves[0], start, moves[2], start, end - start);
		System.arraycopy(moves[1], start, moves[3], start, end - start);

		int j = start;
		int k = middle;
		int i = start;
		int threshold = middle - start;
		while (j < middle && k < end) {
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

		if (j < middle) {
			System.arraycopy(moves[2], j, moves[0], i, middle - j);
			System.arraycopy(moves[3], j, moves[1], i, middle - j);
		} else if (k < end) {
			System.arraycopy(moves[2], k, moves[0], i, end - k);
			System.arraycopy(moves[3], k, moves[1], i, end - k);
		}
	}
}