import java.util.Scanner;
 class atm {
public static void main(String[]args) {
    Scanner scnr = new Scanner(System.in);
   int X = scnr.nextInt();
   double Y =scnr.nextDouble();
   if(X%5==0) {
       
       if(Y-X-0.5>=0) {
           System.out.printf("%.2f",Y-X-0.5);
       }else {
           System.out.printf("%.2f",Y);
       }
   }else {
       System.out.printf("%.2f", Y);
   }
}
}
