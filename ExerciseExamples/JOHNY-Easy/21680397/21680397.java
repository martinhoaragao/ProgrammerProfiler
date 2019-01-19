/*
 * code by mayank kandpal
 * codechef problem JOHNY
 *  https://www.codechef.com/submit/JOHNY
 */
import java.util.Arrays;
import java.util.Scanner;

class JOHNY {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int key = arr[k - 1];
            Arrays.sort(arr);
            int pos = Arrays.binarySearch(arr, key);
            System.out.println(pos + 1);
        }
    }
}
