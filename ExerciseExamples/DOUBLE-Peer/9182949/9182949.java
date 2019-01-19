import java.util.Scanner;

class Double {

	public static void main(String[] args) {
		int t, i, len;
		Scanner in = new Scanner(System.in);
		
		t = in.nextInt();
		in.nextLine();

		int[] ans = new int[t];

		for (i = 0; i < t; i++) {
			len = in.nextInt();
			in.nextLine();
			if (len % 2 == 0)
				ans[i] = len;
			else
				ans[i] = len-1;
		}
	
		for (i = 0; i < t; i++) 
			System.out.println(ans[i]);
	
	}

}
