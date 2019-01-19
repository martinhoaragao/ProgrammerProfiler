/*
 * code by mayank kandpal
 * codechef problem HOLES
 */
import java.util.Scanner;
class HOLES {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int ii=0; ii<t; ii++) {
			String s = sc.next();
			int res = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'O' || s.charAt(i) == 'P' || s.charAt(i) == 'R' || s.charAt(i) == 'Q' ) 
					res += 1;
				else if(s.charAt(i) == 'B')
					res += 2;
			}
			System.out.println(res);
		}
	}
}