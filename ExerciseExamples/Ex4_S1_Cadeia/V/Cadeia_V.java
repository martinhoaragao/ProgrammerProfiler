import java.util.Scanner;

public class SOne {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int c = 0;

    String sub = in.nextLine();
    String whole = in.nextLine();
    char subFirst = sub.charAt(0);

    for(int i = 0; i < whole.length(); i++) {
      if(whole.charAt(i) == subFirst && check(sub, whole, i + 1)) c++;
    }

    System.out.println(c);
  }
  
  private static boolean check(String sub, String whole, int j) {
    for(int i = 1; i < sub.length(); i++) {
      if(j < whole.length() && sub.charAt(i) == whole.charAt(j)) j++;
      else return false;
    }

    return true;
  }
}
