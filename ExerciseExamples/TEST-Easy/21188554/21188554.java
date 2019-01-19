import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        while (true){
            a=sc.nextInt();
            if (a==42){
                break;
            }
            System.out.println(a);

        }
    }
}