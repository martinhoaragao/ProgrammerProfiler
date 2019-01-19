

import java.util.Scanner;

class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			int a=sc.nextInt();
			if(a==42)
			{
				break;
			}
			else
			{
				System.out.println(a);
			}
		}
	}
}
