import java.util.Scanner;

/**
 * Created by shubhamagrawal on 14/06/18.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                int x = scanner.nextInt();
                arr[i] = x;
            }

            int k = scanner.nextInt();
            k = k-1;
            int pos = 0;
            for(int i=0; i<k; i++) {
                if(arr[i] <= arr[k]) {
                    pos++;
                }
            }

            for(int i=k+1; i<n; i++) {
                if(arr[i] < arr[k]) {
                    pos++;
                }
            }

            pos++;
            System.out.println(pos);
        }


    }
}
