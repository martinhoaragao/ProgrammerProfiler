import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int min = Integer.parseInt(args[0]);
        int sum = 0, lido;
        for(int i = 0; i < Integer.parseInt(args[1]); i++) {
            System.out.println("Insira um numero:");
            lido = input.nextInt();
            sum += lido;
            if(lido > min)
                System.out.println(lido);
        }
        System.out.println("Media: " + sum/Integer.parseInt(args[1]));
    }
}
