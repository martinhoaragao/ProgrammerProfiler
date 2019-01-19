import java.util.Scanner;

class DoubleString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		try{
		while(T-->0){
			int N=in.nextInt();
			System.out.println(N-N%2);
		}
		
		
		
	}
	finally{
		if(in!=null)
			in.close();
		}
	}
}
