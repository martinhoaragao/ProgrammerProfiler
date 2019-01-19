import java.util.Scanner;

class aey42 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a;
        a = kb.nextInt();
        while (a != 42) {
            System.out.println(a);
            a = kb.nextInt();
        }
    }
}