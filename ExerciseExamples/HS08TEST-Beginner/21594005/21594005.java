import java.util.Scanner;

class ATM {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        double withdrawal = in.nextDouble();
        double balance = in.nextDouble();

        if(withdrawal % 5 == 0 && withdrawal + 0.5 <= balance){
            System.out.printf("%.2f", balance - withdrawal - 0.5);
        }
        else{
            System.out.printf("%.2f", balance);
        }
    }
}
