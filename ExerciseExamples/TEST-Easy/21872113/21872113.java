import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a;
        do {
            a = input.nextInt();
            if (a!=42) {
                System.out.println(a);
            }
        } while (a != 42);
    }
}