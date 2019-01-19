import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class UncleJhony{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while(testCases>0){
			int noOfSongs = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			
			while(noOfSongs>0){
				list.add(sc.nextInt());
				noOfSongs--;
			}
			
			int favSongPosition = sc.nextInt();
			
			int lenOfFavSong = list.get(favSongPosition-1);
			
			Collections.sort(list);
			
			System.out.println(list.indexOf(lenOfFavSong)+1);
			
			testCases--;
		}
	}
}