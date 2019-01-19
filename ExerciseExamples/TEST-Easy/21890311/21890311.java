import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num;
        num = kb.nextInt();
        while (num != 42) {
            System.out.println(num);
            num = kb.nextInt();
        }
    }
}