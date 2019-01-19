import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 13, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int n = scan.nextInt();
			int[] arr = new int[n];
			
			for(int k = 0; k < arr.length; k++) {
				arr[k] = scan.nextInt();
			}
			
			int m = scan.nextInt();
			int target = arr[m-1];
			int[] brr = mergeSort(arr);
			int key = 0;
			for(int j = 0; j < brr.length; j++) {
				if(brr[j] == target) {
					key = j+1;
				}
			}
			
			System.out.println(key);
		}

	}
	static int[] mergeSort(int[] arr) {
		
		if(arr.length < 2) {
			return arr;
		}
		
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++) {
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
		
		return arr;
	}
	static void merge(int[] left, int[] right, int[] arr) {
		
		int i = 0; 
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length) {
			
			if(left[i] < right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			}
			else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while(i < left.length) {
			arr[k++] = left[i++];
		}
		while(j < right.length) {
			arr[k++] = right[j++];
		}
	}

}
