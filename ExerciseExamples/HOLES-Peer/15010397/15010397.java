import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner w=new Scanner(System.in);
		int n=w.nextInt();
		for(int h=0;h<n;h++){
			int c=0;
			String A=w.next();
			for(int i=0;i<A.length();i++){
				if(A.charAt(i)=='A' || A.charAt(i)=='D' ||A.charAt(i)=='O' ||A.charAt(i)=='P' ||A.charAt(i)=='Q' ||A.charAt(i)=='R' )
						c++;
				else if(A.charAt(i)=='B') c=c+2;
			}
			System.out.println(c);
		}
	}

}
