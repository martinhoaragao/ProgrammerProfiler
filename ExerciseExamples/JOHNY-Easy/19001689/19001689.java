import java.util.Arrays;
import java.util.Scanner;

class JOHNY {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tc = input.nextInt();
		
		while(tc-->0) {

			int limit = input.nextInt();
			int[] arr = new int[limit];
			
			for(int i=0;i<limit;i++)
				arr[i] = input.nextInt();
			
			int val = arr[input.nextInt()-1];
			Arrays.sort(arr);
			System.out.println(Arrays.binarySearch(arr,val)+1);
			
			
		}
		
		input.close();
		
	}

}
