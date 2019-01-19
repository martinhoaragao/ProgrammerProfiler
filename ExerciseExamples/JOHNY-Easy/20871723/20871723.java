import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short T,K,N;
		int arr[],x,el;
		if((T=sc.nextShort())>=1 && T<=1000){
			OUTER: for(int i = 1 ; i <= T; i++) {
				if((N= sc.nextShort())>=1 && N<=100) {
					arr = new int[N+1];
					for(int j = 1; j<= N; j++) {
						if((arr[j]=sc.nextInt())<1 || arr[j] >1000000000) {
							j=j-1;
						}
					}
					if((x=sc.nextInt())>=1 && x <= N) {
						el=arr[x];
						Arrays.sort(arr);
						System.out.println(Arrays.binarySearch(arr, el));
					}else
						continue OUTER;
				}	
			}
		}
	}
}
