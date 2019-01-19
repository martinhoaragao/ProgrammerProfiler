

import java.util.Scanner;

 class DoubleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),n;
		for(int i=1;i<=N;i++)
		{
			n = sc.nextInt();
			n = n-n%2;
			System.out.println(n);
		}
	}

}
