import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    double withdraw = s.nextDouble();
    double balance =s.nextDouble();
    double charge = 0.50;
    if(withdraw>0 && withdraw+charge<=balance){
      if(withdraw%5==0){
        balance = balance-withdraw-charge;
        System.out.println(new BigDecimal(String.valueOf(balance)).setScale(2,BigDecimal.ROUND_HALF_UP));
      }
        else{
          System.out.println(new BigDecimal(String.valueOf(balance)).setScale(2,BigDecimal.ROUND_HALF_UP));
        }
    }
      else if(withdraw<0 || withdraw+charge>balance){
        System.out.println(new BigDecimal(String.valueOf(balance)).setScale(2,BigDecimal.ROUND_HALF_UP));
      }
  }
}
