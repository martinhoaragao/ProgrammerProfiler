
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T;

        Scanner scanner  = new Scanner(System.in);

        T = Integer.parseInt(scanner.nextLine());

        //declaring a table for cases and another one to write number of holes
        int[] cases = new int[T];
        int[] numbers = new int[T];

        for(int i=0; i<T; i++){
            cases[i] = Integer.parseInt(scanner.nextLine());;
        }

        //Calculating holes
        for(int i=0; i<T; i++){
            if (cases[i]%2 == 0 )
                numbers[i] = cases[i];
            else
                numbers[i] = cases[i] - 1;
        }

        //print the result
        for(int i=0; i<T; i++){
            System.out.println(numbers[i]);
        }



    }
}