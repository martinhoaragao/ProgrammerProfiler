import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String input=in.nextLine().toString();
      String[] splited = input.split("\\s+");
      int amt=Integer.parseInt(splited[0]);
      float balance=Float.parseFloat(splited[1]);
      if(amt%5==0)
      {  
          if((amt+0.50)<=balance)
          {
              System.out.printf("%.2f",(balance-amt-0.50));
          }
          else
          {
              System.out.println(balance);
          }
      }
      else
      {
          System.out.println(balance);
      }
    }
}
