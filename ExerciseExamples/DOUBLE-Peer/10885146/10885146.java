import java.util.*;
class doublestrings{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long t, n; t = in.nextInt();
		while(t-- > 0){
			n = in.nextInt();
			if(n % 2 == 0)	System.out.println(n);
				else	System.out.println(n - 1);
		}
	}
}