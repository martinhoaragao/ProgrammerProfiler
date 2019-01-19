import java.util.Scanner;
import java.util.Arrays;
class JOHNY {
	public static void main(String [] args){
		 Scanner sc = new Scanner(System.in);
	        int tests = sc.nextInt();
	        for (int j= 0; j < tests; j++){
	            int size = sc.nextInt();
	            int [] arr = new int[size];
	            for (int i = 0; i < size; i++) {
	                arr[i] = sc.nextInt();
	            }
	            int val = arr[sc.nextInt()-1];
	            Arrays.sort(arr);
	            int lo = 0, hi = arr.length-1;
	            while (lo <= hi) {
	            	int mid = lo + ((hi-lo)/2);
	            	if (arr[mid] == val) {
	            		System.out.println(mid+1);
	            		break;
	            	} else if (arr[mid] > val) {
	            		hi--;
	            	} else {
	            		lo++;
	            	}
	            }
	        }
	}
}