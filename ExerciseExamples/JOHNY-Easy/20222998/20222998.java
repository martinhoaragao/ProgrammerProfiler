import java.util.Scanner;
import java.util.Arrays;
class UncleJonny {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int arrSize = sc.nextInt();
			int[] arr = new int[arrSize];
			for(int i=0; i<arrSize; i++)
				arr[i] = sc.nextInt();
			int pos = sc.nextInt();
			int[] sortArr = new int[arr.length];
			for(int i=0; i<arr.length; i++)
				sortArr[i] = arr[i];
			Arrays.sort(sortArr);
			int song = arr[pos-1];
			int newPos = Arrays.binarySearch(sortArr, song);
			System.out.println(newPos+1);
		}
	}
}
