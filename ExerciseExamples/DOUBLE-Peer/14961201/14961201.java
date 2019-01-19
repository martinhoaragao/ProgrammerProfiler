import java.util.Scanner;

class DOUBLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++){
			int n=scn.nextInt();
			if(n%2==0)
				System.out.println(n);
			else System.out.println(n-1);
		}
	}

}