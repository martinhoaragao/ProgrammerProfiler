import java.io.*;
import java.util.Arrays;

class GFG {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().trim().split("\\s+");

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            int k = Integer.parseInt(br.readLine());
            int elem = arr[k-1];
            
            Arrays.sort(arr);
            int ans = -1;
            for(int i = 0; i < n; i++) {
                if(arr[i] == elem){
                    ans = i;
                    break;
                }
            }
            println(ans + 1);
        }
        
        
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void print(Object o) {
        System.out.print(o);
    }
}

