import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Character> oneHole;
    static {
        oneHole = new ArrayList<>();
        oneHole.add('A');
        oneHole.add('D');
        oneHole.add('O');
        oneHole.add('P');
        oneHole.add('R');
        oneHole.add('Q');
    }
    private static List<Character> twoHoles;
    static {
        twoHoles = new ArrayList<>();
        twoHoles.add('B');
    }

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

        for(char c : text.toCharArray()) {
            if (oneHole.contains(c)) {
                count++;
            } else if (twoHoles.contains(c)) {
                count+=2;
            }
        }
        return count;
    }
}
