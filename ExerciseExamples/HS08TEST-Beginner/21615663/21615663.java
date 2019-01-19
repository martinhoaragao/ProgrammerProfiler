import java.io.*;
import java.util.*;
import java.text.*;
 class solution{
    public static void main(String args[]) throws IOException{
      
      try{
          Scanner input = new Scanner(System.in);
          int amount = input.nextInt();
          double balance = input.nextFloat();
           DecimalFormat df2 = new DecimalFormat("#.00");
          if((amount%5==0) && (balance>amount+0.5)){
              balance = balance-amount-0.5;
              System.out.println(df2.format(balance));
              
          }
          else{
              System.out.println(df2.format(balance));
          }
      }
      catch(Exception e){
          return;
      }
    }
}