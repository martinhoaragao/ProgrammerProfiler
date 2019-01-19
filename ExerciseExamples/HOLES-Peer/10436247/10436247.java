import java.util.Scanner;

class Main {

	private static int testCases;

	public static void main(String str[]) throws Throwable {
		Scanner sc = new Scanner(System.in);
		testCases = sc.nextInt();
		String alpha = new String("ADOPQR");
		while (testCases-- > 0) {
			String inp=new String(sc.next());
			int ans=0;
			for(int i=0;i<inp.length();i++){
				if(alpha.contains(String.valueOf(inp.charAt(i))))
					ans++;
				else if(inp.charAt(i)=='B')
					ans+=2;
			}
			System.out.println(ans);
		}

		sc.close();
	}
}