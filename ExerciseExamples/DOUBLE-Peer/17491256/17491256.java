import java.util.*;
class DOUBLE {

	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T != 0){
			
			int n = 0;
			int N = sc.nextInt();
			if(N == 0)n = 0;
			else if(N%2 == 0) n = N;
			else n = N-1;
			
			System.out.println(n);
			T--;
		}
	}

}
