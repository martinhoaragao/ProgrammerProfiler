import java.io.*;
import java.util.Scanner;

class DoubleString {
	public static void main(String argsp[]){
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int i=0;i<t;i++){
				int a=sc.nextInt();
				if(a%2==0)
					System.out.println(a);
				else
					System.out.println(a-1);
			}
	}
}