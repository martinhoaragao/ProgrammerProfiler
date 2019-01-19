
import java.util.Scanner;

class HelloWorld{

     public static void main(String []args){
       // System.out.println("Hello World");
       
       Scanner sc = new Scanner(System.in);
        double chrg = 0.5;
        //System.out.println("enter deduct");
        double deduct = sc.nextDouble();
        //System.out.println("enter amount");
        double amount = sc.nextDouble();
        double ded_amt = deduct + chrg ;
        if( ded_amt < amount){
            if( (deduct % 5) == 0){
                amount = amount - ded_amt;
                System.out.println(amount);
            }else{
                System.out.println(amount);
            }
        }else{
            System.out.println(amount);
        }
        
     }
}