import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();        
        int length;
        while(T > 0) {
            length = in.nextInt();
            if((length % 2) == 0)
                System.out.println(length);
            else
                System.out.println(length - 1);
            T--;
        }
    }
}
