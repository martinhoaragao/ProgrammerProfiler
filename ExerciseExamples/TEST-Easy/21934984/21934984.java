import java.util.Scanner ;

class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		int N ;
		N = sc.nextInt() ;
		while( N != 42 ) {
			System.out.println(N);
			N = sc.nextInt();
		}
	}

}
