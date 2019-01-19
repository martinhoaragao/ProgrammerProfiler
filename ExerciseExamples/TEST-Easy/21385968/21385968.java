//rewrite small numbers from input to output. '
//Stop processing input after reading in the number 42. All numbers
// at input are integers of one or two digits.

//TEST AC - Java
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int n = in.nextInt();
      if (n == 42) break;
      System.out.println(n);
    }
  }
}