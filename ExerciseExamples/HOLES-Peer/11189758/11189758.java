import java.util.Scanner;
class atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=1;j<=t;j++)
		{
			int H=0;
			String str=sc.next();
			for(int i=0;i<str.length();i++)
			{
				char C=str.charAt(i);
				if(C=='A' || C=='D' || C=='O' || C=='P' || C=='Q' || C=='R')
					H++;
				else if(C=='B')
					H=H+2;				
			}
			System.out.println(H);
		}
	}

}
