import java.util.Scanner;
import java.util.Arrays;
class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i =0; i<size; i++){
				arr[i] = sc.nextInt();
				}
			int temp = sc.nextInt();
			int johnny = arr[temp-1];
			Arrays.sort(arr);
			for(int i = 0; i<arr.length; i++){
				if(arr[i] == johnny){
					System.out.println(i+1);
				}
			}
		}
	}
}