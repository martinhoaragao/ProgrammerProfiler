/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void merge(int[] arr, int start, int mid, int end) {
        int lengthOfLeft = mid - start + 1;
        int lengthOfRight = end - mid;
        int[] arrLeft = new int[lengthOfLeft];
        int[] arrRight = new int[lengthOfRight];
        
        for (int i = 0; i < lengthOfLeft; ++i) {
            arrLeft[i] = arr[start + i];
        }
        
        for (int j = 0; j < lengthOfRight; ++j) {
            arrRight[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = start;
        
        while (i < lengthOfLeft && j < lengthOfRight) {

            if (arrLeft[i] <= arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }
        
        while (i < lengthOfLeft) {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }
        
        while (j < lengthOfRight) {
            arr[k] = arrRight[j];
            j++;
            k++;
        }
        
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		for (int t = 0; t < testCases; t++) {
		    int noOfSongs = sc.nextInt();

		    int[] playlist = new int[noOfSongs];
		    
		    for(int i = 0; i < noOfSongs; i++) {
		        playlist[i] = sc.nextInt();
		    }
		    
		    int K = sc.nextInt();

		    int toFind = playlist[K - 1];
		    
		    mergeSort(playlist, 0, noOfSongs - 1);
		    
		    for (int i = 0; i < noOfSongs; i++) {
		        if (toFind == playlist[i]) {
		            System.out.println(i + 1);
		        }
		    }
		    
		}
	}
}
