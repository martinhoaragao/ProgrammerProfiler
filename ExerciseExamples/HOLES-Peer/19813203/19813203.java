import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String string = scanner.next();
            int count = 0;
            while (string.length() > 0) {
                if (string.charAt(0)=='A'||string.charAt(0)=='D'||string.charAt(0)=='P'||string.charAt(0)=='O'||string.charAt(0)=='R'||string.charAt(0)=='Q'){
                    count++;
                }
                if (string.charAt(0)=='B'){
                    count=count+2;
                }
                string=string.substring(1);
            }
            System.out.println(count);
        }
    }
}
