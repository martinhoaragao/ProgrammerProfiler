import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String text = scanner.next();
            System.out.println(countHole(text));
        }

    }

    private static int countHole(String text) {
        int count = 0;
        
        char[] chars = text.toCharArray();
        for(char c : chars) {
            if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'Q' || c == 'R') {
                count++;
            } else if (c == 'B') {
                count+=2;
            }
        }
        return count;
    }
}
