import java.util.*;
import java.io.*;

class ATM {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		float money=scan.nextFloat();
		float balance=scan.nextFloat();
		if( (money>0) && (money<=2000) ){
			if( (balance>=0) && (balance<=2000) ){
					if((balance<=(money+0.50))){
						System.out.printf("%.2f",balance);
					}
					else{
						if((money%5==0)){
				
							System.out.printf("%.2f",(balance-money-0.50));
		
						}
						else{
							System.out.printf("%.2f",balance);
						}
					}
			}else{
				System.out.printf("%.2f",balance);
			}
		}
		else{
			System.out.printf("%.2f",balance);
		}
		
	}
}
