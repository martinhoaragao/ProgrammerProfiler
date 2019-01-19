import java.util.Scanner;

class DOUBLE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		short t=sc.nextShort();
		int n;
		while(t-->0)
		{
			n=sc.nextInt();
			if(n%2==0)
				System.out.println(n);
			else 
				System.out.println(n-1);
		}
	}

}