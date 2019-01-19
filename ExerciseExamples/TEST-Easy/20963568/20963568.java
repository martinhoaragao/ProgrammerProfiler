import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNextInt()) {
      int num = in.nextInt();
      if (num==42) {
        break;
      } else {
        System.out.println(num);
      }
    }
  }
}
