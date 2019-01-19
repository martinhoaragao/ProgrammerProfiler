import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLong()) {
      long input = sc.nextLong();
      long res = findBestPrice(input);
      System.out.println(res);
    }
    sc.close();
  }

  private static long findBestPrice(long inp) {
    if (inp < 12L) {
      return (long) inp;
    } else {
      return findBestPrice(inp / 2L) + findBestPrice(inp / 3L) + findBestPrice(inp / 4L);
    }
  }
}