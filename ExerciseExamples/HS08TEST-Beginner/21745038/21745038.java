import java.io.*;
import java.util.Scanner;


 class Atm {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		double o;
		
		if(X%5==0 && (X+0.50)<Y) {
			o = (Y-X)-0.50;
			System.out.println(o);
		} else if(X>Y) {						
			System.out.println(Y);
		} else {
			System.out.println(Y);
		}
		sc.close();
						
	}

}