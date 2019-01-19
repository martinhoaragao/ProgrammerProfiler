import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();  // 1000
		
		for (int a=0; a<t; a++) {
			int n = s.nextInt();  //100
			int[] songs = new int[n];
			for (int b=0; b<n; b++) {
				songs[b] = s.nextInt();
			}
			int k = s.nextInt();  //100
			int k_length = songs[k-1];
			Arrays.sort(songs);
			
			int m = 0;
			// should I use binary search here?  well 1000*100 = 100000 so linear should be fine..
			while (songs[m] != k_length) {
				m++;
			}
			System.out.println(m+1);
			
		}
		
		s.close();
	}

}
