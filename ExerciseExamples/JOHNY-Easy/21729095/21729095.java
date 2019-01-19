import java.util.*;
class UncleJohny {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while(testCases-->0) {
			int numberOfSongs = scan.nextInt();
			int[] playlist = new int[numberOfSongs];
			for(int i=0;i<numberOfSongs;i++) {
				playlist[i] = scan.nextInt();
			}
			int currentPosition = scan.nextInt();
			int currentElement = playlist[currentPosition-1];
			int finalPosition=0;
			for(int i=0;i<numberOfSongs;i++) {
				if(playlist[i]==currentElement | playlist[i]>currentElement) {
					continue;
				}
				else {
					finalPosition++;
				}
			}
			System.out.println(finalPosition+1);
			
		}
	}

}
