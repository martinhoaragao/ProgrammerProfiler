import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        float y = scan.nextFloat();
        if (x%5 == 0){
            if (y-x-0.5 >=0){
                System.out.printf("%.2f",y-x-0.5);
                return;
            }
        }
        System.out.printf("%.2f",y);
    }    
}