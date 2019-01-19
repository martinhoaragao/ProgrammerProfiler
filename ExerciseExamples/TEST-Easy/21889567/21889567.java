import java.util.Scanner;

class Life {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        int a;
        a = keybord.nextInt();
        while (a != 42) {
            System.out.println(a);
            a = keybord.nextInt();
        }
    }
}