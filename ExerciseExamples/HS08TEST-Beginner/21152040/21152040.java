import java.util.Scanner;

import java.io.*;

class Main{

public static void main(String args[]){
  
Scanner sc=new Scanner(System.in);
int X=sc.nextInt();
float Y=sc.nextFloat();
if( X < (Y - 0.5)){
	
		if( X % 5 == 0 ){

		System.out.println(String.format("%.2f", Y - X - 0.5));

		sc.close();
			
        	return;

		}

		}

		System.out.println(String.format("%.2f", Y));

		sc.close();

	
}


}
