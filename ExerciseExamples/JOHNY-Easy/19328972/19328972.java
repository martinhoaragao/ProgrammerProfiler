import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         int j = 0; 
        while(n>0){
           
            int num = scan.nextInt();
           
            int array[] = new int[num];
            for (int i = 0; i < num; i++) {
                array[i] = scan.nextInt();
            }
            int k = scan.nextInt();
            int find = array[k - 1];
            Arrays.sort(array);
            for (int i = 0; i < num; i++) {
                if(find == array[i]){
                     j = i + 1;
                }
               
            }
             System.out.println(j);
            n--;
        }
        
        
        
    }
    
}