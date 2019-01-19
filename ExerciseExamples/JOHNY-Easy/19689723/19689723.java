
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kapil Gehlot
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int val = arr[k-1];
            Arrays.sort(arr);
            System.out.println(Arrays.binarySearch(arr, val)+1);
        }
    }
}
