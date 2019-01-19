import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
         int ans = 0; 
        while(t-->0){
           
            int n = s.nextInt();
           
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = s.nextInt();
            }
            int k = s.nextInt();
            int find = array[k - 1];
            Arrays.sort(array);
            for (int i = 0; i < n; i++) {
                if(find == array[i]){
                     ans = i + 1;
                }
               
            }
             System.out.println(ans);
            
        }
        
        
        
}
}   