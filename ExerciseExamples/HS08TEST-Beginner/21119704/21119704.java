import java.util.*;
 
 public class  Main {
 
   public static void main(String args[]) {
    
    Scanner obj = new Scanner(System.in);
    
    int withdraw = obj.nextInt();
    
    double bal = obj.nextDouble();
    
    if ( bal > (withdraw+0.50) && (withdraw % 5 == 0) ) {
    
    bal = bal - (withdraw+0.50);
    
    }
    
   System.out.printf("%.2f", bal);
    
    
   
   }
 
 }

