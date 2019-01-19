import java.util.Scanner;
class HolesInText {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
			String s = in.next();
			System.out.println(count(s));
		}
		in.close();
	}

	private static int count(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for(char c : ch)
		{
			if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q' || c=='R')count++;
			if(c=='B')count+=2;
		}
		return count;
	}
}
