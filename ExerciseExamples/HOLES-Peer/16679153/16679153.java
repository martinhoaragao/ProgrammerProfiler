import java.util.Scanner;

class Holes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{
			String st=new String();
			st=s.next();
			int hole=0;
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)=='A'||st.charAt(i)=='D'||st.charAt(i)=='O'||st.charAt(i)=='P'||st.charAt(i)=='Q'||st.charAt(i)=='R')
				{
					hole=hole+1;
				}
				else if(st.charAt(i)=='B')
				{
					hole=hole+2;
				}
			}
			t--;
			System.out.println(hole);
		}

	}

}
