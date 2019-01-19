import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int testCases = scanner.nextInt();
    for (int i = 0; i < testCases; i++) {
      solveCase();
    }
  }

  private static void solveCase() {
    int n = scanner.nextInt();
    int idSum = 0;
    int childrenSum = 0;
    for (int i = 0; i < n; i++) {
      idSum += scanner.nextInt();
      childrenSum += scanner.nextInt();
    }
    System.out.println(idSum - childrenSum);
  }

}
