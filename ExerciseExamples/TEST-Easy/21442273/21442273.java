import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int stdIn = input.nextInt();
        
        while (stdIn != 42) {
            System.out.println(stdIn);
            stdIn = input.nextInt();
        }

    }

}