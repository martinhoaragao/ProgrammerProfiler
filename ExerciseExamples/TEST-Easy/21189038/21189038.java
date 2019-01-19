import java.util.Scanner;

class Life {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num = stdin.nextInt();
        if (num != 42) {
            System.out.println(num);
            while (num != 42 && stdin.hasNextInt()) {
                num = stdin.nextInt();
                if (num != 42) {
                    System.out.println(num);
                }
            }
        }
    }
}