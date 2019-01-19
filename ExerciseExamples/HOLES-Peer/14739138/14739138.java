import java.util.Scanner;


class checkHoles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		String s;
		sc.nextLine();
		int i;
		while(tc!=0)
		{
			s=sc.nextLine();
			int holes=0;
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='A'||s.charAt(i)=='D'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R')
					holes++;
				else if(s.charAt(i)=='B')
					holes=holes+2;
			}
			System.out.print(holes+"\n");
			
			tc--;
		}

	}

}
