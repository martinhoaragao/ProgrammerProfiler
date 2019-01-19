import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s;
		int count = 0;
		
		for(int i=0;i<T;i++) {
			s = sc.next();
			count = 0;
			for(int j = 0;j<s.length();j++) {
				if(s.charAt(j) == 'A' || s.charAt(j) == 'D' ||
						s.charAt(j) == 'O' || s.charAt(j) == 'P' || s.charAt(j) == 'Q' || s.charAt(j) == 'R') {
					count = count + 1;
				} else if (s.charAt(j) == 'B') {
					count = count + 2;
				}
			}
			System.out.println(count);
		}
	}

}

