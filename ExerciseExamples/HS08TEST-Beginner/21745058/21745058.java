import java.io.*;
import java.util.Scanner;


 class Atm {

	 public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
int X = sc.nextInt();
		double Y = sc.nextDouble();

		if(X%5!=0||(Y-X-0.5)<0 ){
	
			System.out.println(Y);
		} else {
			System.out.println(Y-X-0.5);
		}
		sc.close();
						
	}

}