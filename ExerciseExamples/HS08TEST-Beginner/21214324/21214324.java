import java.util.Scanner;
 class Test {

  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);

     int withdrawAmount = sc.nextInt();
     double totalAmount = sc.nextDouble();

     if(withdrawAmount % 5 == 0 && withdrawAmount <= (totalAmount - 0.50)){
         totalAmount = totalAmount - 0.5 - (withdrawAmount);

     }

     System.out.println(String.format("%.2f",+totalAmount));
    
  }

}