import java.util.Scanner;

public class Main {
	public static long exchangeCoin(long c){
		long sum = c/2+c/3+c/4;
		if(sum>c)
			return exchangeCoin(c/2)+exchangeCoin(c/3)+exchangeCoin(c/4);
		else{
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(exchangeCoin(sc.nextLong()));
		}
		
	}

}
