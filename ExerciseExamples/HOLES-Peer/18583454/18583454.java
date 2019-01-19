import java.util.Scanner;
//import java.text.*;

class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=a.next();
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='A' || s.charAt(j)=='D' || s.charAt(j)=='O' || s.charAt(j)=='P' || s.charAt(j)=='R' || s.charAt(j)=='Q')
				{
					c+=1;
				}
				else if(s.charAt(j)=='B')
				{
					c+=2;
				}
			}
			System.out.println(c);
		}
		a.close();
	}

}
