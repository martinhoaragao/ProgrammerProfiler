import java.util.Scanner;

class Sol {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            double y = sc.nextDouble();
            if(x % 5 == 0) {
                  if(x + 0.50 <= y) {
                        y -= (x + 0.50);
                  }
            }
            System.out.printf("%.2f" , y);
      }
}