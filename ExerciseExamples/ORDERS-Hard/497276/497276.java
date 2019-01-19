import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream fdout = new FileOutputStream(FileDescriptor.out);
		BufferedOutputStream bos = new BufferedOutputStream(fdout,
				1024 * 1024 * 2);
		PrintStream ps = new PrintStream(bos, false);
		System.setOut(ps);

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

			reorder(moves, 0, noOfPeople - 1);
			printOrder(moves);
		}
	}

	public static void printOrder(int[][] moves) {
		int[] rank = new int[moves[0].length];
		for (int i = 0; i < rank.length; i++) {
			rank[moves[0][i]] = i + 1;
		}
		for (int i = 0; i < rank.length - 1; i++) {
			System.out.print(rank[i] + " ");
		}
		System.out.println(rank[rank.length - 1]);
		System.out.flush();
	}

	public static void reorder(int[][] moves, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (startIndex + endIndex) / 2;
			reorder(moves, startIndex, middleIndex);
			reorder(moves, middleIndex + 1, endIndex);
			merge(moves, startIndex, middleIndex, endIndex);
		}
	}

	public static void merge(int[][] moves, int startIndex, int middleIndex,
			int endIndex) {
		int size1 = middleIndex - startIndex + 1;
		int size2 = endIndex - middleIndex;

		int[][] arr1 = new int[2][size1];
		int[][] arr2 = new int[2][size2];

		for (int i = 0; i < size1; i++) {
			arr1[0][i] = moves[0][startIndex + i];
			arr1[1][i] = moves[1][startIndex + i];
		}

		for (int i = 0; i < size2; i++) {
			arr2[0][i] = moves[0][middleIndex + i + 1];
			arr2[1][i] = moves[1][middleIndex + i + 1];
		}

		int j = 0;
		int k = 0;

		int thresholdMoves = size1;

		for (int i = startIndex; i <= endIndex; i++) {
			if (j == size1) {
				moves[0][i] = arr2[0][k];
				moves[1][i] = arr2[1][k];
				k++;
			} else if (k == size2) {
				moves[0][i] = arr1[0][j];
				moves[1][i] = arr1[1][j];
				j++;
			} else {
				if ((arr2[1][k] - arr1[1][j]) >= thresholdMoves) {
					moves[0][i] = arr2[0][k];
					moves[1][i] = arr2[1][k] - thresholdMoves;
					k++;
				} else {
					moves[0][i] = arr1[0][j];
					moves[1][i] = arr1[1][j];
					j++;
					thresholdMoves--;
				}
			}
		}
	}
}