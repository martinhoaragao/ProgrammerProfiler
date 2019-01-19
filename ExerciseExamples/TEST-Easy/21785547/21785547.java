import java.util.Scanner;

class MainClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        while ((x = sc.nextInt()) != 42 ) {
            System.out.println(x);
        }
    }
}
