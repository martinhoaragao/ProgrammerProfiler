import java.util.*;
class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int draw = sc.nextInt();
		double bal = sc.nextDouble();
		if(draw < bal - 0.5 && draw % 5 == 0) {
			bal -= (draw + 0.50);
		}
		String s = String.valueOf(bal);
		String t = s.substring(s.indexOf('.'));
		int a = 3 - t.length();
		for(int i = 0; i < a; i++) {
			s += "0";
		}
		System.out.println(s);
	}
}