import java.util.Arrays;
import java.util.Scanner;

class UncleJhonny {

	public static void main(String[] args) {
		int noOftest;
		int noOfSongs;
		int posUncleJonny;
		int song;
		int list[];

		Scanner sc = new Scanner(System.in);
		noOftest = sc.nextInt();
		for (int a = 0; a < noOftest; a++) {
			noOfSongs = sc.nextInt();
			list = new int[noOfSongs];
			for (int b = 0; b < noOfSongs; b++) {
				list[b] = sc.nextInt();
			}
			posUncleJonny = sc.nextInt();
			song = list[posUncleJonny - 1];
			Arrays.sort(list);
			System.out.println(positionOfSong(song, list));
		}
		        sc.close();
			System.exit(0);
	}

	private static int positionOfSong(int song, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == song) {
				return i + 1;
			}
		}
		return 0;
	}
}
