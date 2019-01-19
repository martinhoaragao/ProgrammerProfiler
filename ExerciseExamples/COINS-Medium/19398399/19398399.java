
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		while(sc.hasNext()) {
			tmp = sc.nextInt();
			System.out.println(rec(tmp));
		}
	}
	
	public static long rec(long x) {
		if(x<12)
			return x;
		
		return rec(x/2) + rec(x/3)+ rec(x/4);
	}

}
