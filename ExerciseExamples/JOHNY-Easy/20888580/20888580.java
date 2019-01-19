import java.util.Scanner;


public class Main{

    
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n=sc.nextInt();
            Integer arr[] = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int p = sc.nextInt()-1,loc=1;
            for (Integer arr1 : arr) {
                if (arr1 < arr[p]) {
                    loc++;
                }
            }
            System.out.println(loc);
        }
    }
    
}