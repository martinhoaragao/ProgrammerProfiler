import java.util.*;
import java.io.*;
class New {
	public static int encode (String str) {
		StringBuilder s = new StringBuilder(str);
		int len = s.length();
		int temp =0;
		for (int i = 0; i < len; i++) {
			switch (s.charAt(i)) {
			case 'A':case 'Q':case 'O':case 'R':case 'P':case 'D':
				temp++;
				break;
			case 'B':
				temp+=2;
				break;
			default:
				break;
			}
			
		}
		return temp;
	}
	
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {	
			String str = kb.next();
			System.out.println(encode(str));
		}
	}
}