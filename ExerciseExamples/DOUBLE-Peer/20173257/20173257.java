import java.util.Scanner;

class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
			long n = in.nextLong();
			if(n==0 || n % 2==0)
				System.out.println(n);
			else
			   System.out.println(n-1);	
		}
		in.close();
	}
}
