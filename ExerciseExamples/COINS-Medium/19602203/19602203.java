
import java.util.Scanner;

public class Main{
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println();
		while(sc.hasNext()){
			long num = sc.nextLong();
			System.out.println(process(num));
		}
	}
	public static long process(long num){
		long sum = (num/2) + (num/3) + (num/4);
		if(sum > num){
			return process(num/2) + process(num/3) + process(num/4);
		}
		else{
			return num;
		}
	}

}
