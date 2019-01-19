import java.util.Scanner;

public class Main{
  public static void main(String a[]){
    int num;
    Scanner s = new Scanner(System.in);
    while(true){
      num = s.nextInt();
      if (num !=42)
        System.out.println(num);
      else
        System.exit(0);
        //break;
    }
  }
}