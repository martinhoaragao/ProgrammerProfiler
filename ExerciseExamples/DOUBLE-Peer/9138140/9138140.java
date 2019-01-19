import java.util.Scanner;
class DoubleStrings {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		long test;
		Scanner read=new Scanner(System.in);
		long  n=read.nextInt();		
		while(n-->0)
		{
			test=read.nextInt();
			
			if(test%2==0)
				System.out.println(test);
			else
				System.out.println(test-1);
		}
	}

}
