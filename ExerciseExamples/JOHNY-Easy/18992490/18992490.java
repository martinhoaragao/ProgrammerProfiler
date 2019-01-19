import java.util.Arrays;
import java.util.Scanner;
class JOHNY {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        for(int h = 0; h<T; h++){
            int N = S.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i<N; i++){
                arr[i] = S.nextInt();
            }
            int k = S.nextInt();
            int ans = arr[k-1];
            Arrays.sort(arr);
            for(int i = 0; i<N; i++){
                if(ans == arr[i]){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
