import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    int tests = input.nextInt();

    for (int test = 0; test < tests; test++) {
      int n = input.nextInt();
      int root = 0;

      for(int i = 0; i < n; i++) {
        int id = input.nextInt();
        int value = input.nextInt();

        root += (id - value);
      }

      System.out.println(root);
    }
  }
}
