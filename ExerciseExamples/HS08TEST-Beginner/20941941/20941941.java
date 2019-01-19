import java.util.Scanner;

public class Main {
 
	public static void main(String args[]) {
		
		double saque, saldo;
		Scanner sc = new Scanner(System.in);
		
		saque = sc.nextDouble();
		saldo = sc.nextDouble();
		
		if((saque % 5) != 0 || (saque + 0.50) > saldo){
			System.out.println(saldo);
		}else{
			saldo = saldo - saque - 0.50;
			System.out.println(saldo);
		}
	}
}