import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    private static Map<Long, Long> results = new HashMap<>();
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-->0){
            int N = sc.nextInt();
            int sum_ids=0;
            int sum_childs=0;
            for(int i=0;i<N;i++){
                sum_ids+= sc.nextInt();
                sum_childs+=sc.nextInt();
            }
            System.out.println(sum_ids - sum_childs);
        }
    }
} 