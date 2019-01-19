import java.util.Scanner;
class ATM {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x%5==0 && (x+0.5)<=y) {
            System.out.printf("%.2f\n",y-x-0.5);
        } else {
            System.out.printf("%.2f\n",y);
        }
    }
}