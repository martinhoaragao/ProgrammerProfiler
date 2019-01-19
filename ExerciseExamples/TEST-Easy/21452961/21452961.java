import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while((a = sc.nextInt()) != 42) {
            System.out.println(a);
        }
    }
}