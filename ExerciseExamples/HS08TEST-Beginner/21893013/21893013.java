import java.util.Scanner;

class ATM {
    
public static void main(String[] arg) {
        
int amount;
        
double bankbalance;
        
Scanner scanner = new Scanner(System.in);
        
amount = scanner.nextInt();
        
double actualbalance = bankbalance = scanner.nextDouble();
        
bankbalance -= 0.50;
        
if(amount%5==0 && amount<=bankbalance) {
            
actualbalance = bankbalance - amount;
        
}
        
System.out.printf("%.2f", actualbalance);
    
}

}
