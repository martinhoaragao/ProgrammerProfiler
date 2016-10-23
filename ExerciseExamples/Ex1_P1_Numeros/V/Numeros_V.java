import java.util.Scanner;

public class POne {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;

    int even = 0;
    int odd = 0;
    int sum = 0;

    while((n = in.nextInt()) != 0) {
      if(even(n)) {
        even++;
        sum += n;
      } else {
        odd++;
      }
    }

    System.out.println(even);
    System.out.println(odd);
    System.out.println(sum / (float) even);
  }

  private static boolean even(int n) {
    return (n & 1) == 0;
  }
}
