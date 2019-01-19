import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        outer: while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            int p = arr[in.nextInt() - 1];
            Arrays.sort(arr);
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == p) {
                    System.out.println(i+1);
                    continue outer;
                }
            }
            
            System.out.println("Not Found");
        }
    }
}