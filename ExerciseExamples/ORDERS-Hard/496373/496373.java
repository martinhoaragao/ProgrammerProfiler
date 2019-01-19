import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < noOfCases; i++) {
			int noOfPeople = Integer.parseInt(br.readLine());
			String movementStr = br.readLine();
			String[] movementStrArr = movementStr.split(" ");
			int[][] moves = new int[2][noOfPeople];
			for (int j = 0; j < noOfPeople; j++) {
				moves[1][j] = Integer.parseInt(movementStrArr[j]);
			}

			for (int j = 0; j < noOfPeople; j++) {
				moves[0][j] = j;
			}

			final int[][] tmpArr = new int[2][noOfPeople];
			reorder(moves, 0, noOfPeople - 1, tmpArr);
			printOrder(moves, noOfPeople);
		}
	}

	public static void printOrder(int[][] moves, int size) {
		for (int i = 0; i < size; ++i) {
			moves[1][moves[0][i]] = i + 1;
		}
		for (int i = 0; i < size - 1; ++i) {
			System.out.print(moves[1][i] + " ");
		}
		System.out.println(moves[1][size - 1]);
	}

	public static void reorder(int[][] moves, int startIndex, int endIndex,
			int[][] tmpArr) {
		if (startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) >> 1;
			reorder(moves, startIndex, middleIndex, tmpArr);
			reorder(moves, middleIndex + 1, endIndex, tmpArr);
			merge(moves, startIndex, middleIndex, endIndex, tmpArr);
		}
	}

	public static void merge(int[][] moves, int startIndex, int middleIndex,
			int endIndex,

			int[][] arr1) {
		int actualMiddleIndex = middleIndex + 1;
		int length = endIndex - startIndex + 1;
		int actualEnd = endIndex + 1;
		int thresholdMoves = actualMiddleIndex - startIndex;
		System.arraycopy(moves[0], startIndex, arr1[0], startIndex, length);
		System.arraycopy(moves[1], startIndex, arr1[1], startIndex, length);

		int j = startIndex;
		int k = actualMiddleIndex;
		int i = startIndex;

		while (j <= middleIndex && k <= endIndex) {
			int value = arr1[1][k] - thresholdMoves;
			if (value >= arr1[1][j]) {
				moves[0][i] = arr1[0][k];
				moves[1][i] = value;
				++k;
			} else {
				moves[0][i] = arr1[0][j];
				moves[1][i] = arr1[1][j];
				++j;
				--thresholdMoves;
			}
			++i;
		}

		if (j <= middleIndex) {
			System.arraycopy(arr1[0], j, moves[0], i, actualMiddleIndex - j);
			System.arraycopy(arr1[1], j, moves[1], i, actualMiddleIndex - j);
		} else if (k <= endIndex) {
			System.arraycopy(arr1[0], k, moves[0], i, actualEnd - k);
			System.arraycopy(arr1[1], k, moves[1], i, actualEnd - k);
		}
	}
}
