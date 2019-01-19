
import java.util.Arrays;
import java.util.Scanner;


 class UncleJohny {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while (testCases != 0) {
			int n = scanner.nextInt();
			int[] songLengths = new int[n];
			for (int i = 0; i < n; i++) {
				songLengths[i] = scanner.nextInt();
			}
			int k = scanner.nextInt();
			System.out.println(findUncleJohnyLocation(songLengths, k));

			testCases--;

		}
	}

	private static int findUncleJohnyLocation(int[] songLengths, int k) {
		int uncleJohnyLengthson = songLengths[k-1];
		Arrays.sort(songLengths);
		for (int i = 0; i < songLengths.length; i++)
			if (songLengths[i] == uncleJohnyLengthson)
				return i + 1;

		return -1;
	}
}
