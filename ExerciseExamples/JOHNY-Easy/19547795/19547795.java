
import java.util.Arrays;
import java.util.Scanner;

class UncleJohny {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();// test cases
		
		while(t-- > 0) {
			int noOfSongs = s.nextInt();
			
			int[] song = new int[noOfSongs];
			for(int i=0;i<noOfSongs;i++) {
				song[i] = s.nextInt();
			}
			
			int pos = s.nextInt();// uncle john position
			int uncleJohn = song[pos-1];
			
			Arrays.sort(song);
			for(int i=0;i<noOfSongs;i++) {
				if(song[i] == uncleJohn) {
					System.out.println(i+1);
					break;
				}
			}
		}
		
	}

}