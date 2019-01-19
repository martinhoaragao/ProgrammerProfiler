

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        while ((a=in.nextInt())!=42)
        {
            System.out.println(a);
        }
        System.out.println();
    }
}
