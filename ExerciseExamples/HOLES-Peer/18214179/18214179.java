
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int k = 0;
        int verify = 0;
        String[] teste = new String[casos];
        for (int i = 0;i < casos; i++) {
            teste[i] = input.next();
        }
        for (int i = 0; i < casos; i++) {
            k = 0;
            for (int h = 0; h < teste[i].length(); h++) {
                if (teste[i].charAt(h) == 'A' || teste[i].charAt(h) == 'R' || teste[i].charAt(h) == 'O' || teste[i].charAt(h) == 'P' || teste[i].charAt(h) == 'Q' || teste[i].charAt(h) == 'D') {
                    k = k + 1;
                } else if (teste[i].charAt(h) == 'B') {
                    k = k + 2;
                }
            }
            System.out.println(k);
        }
        
    }
    
}
