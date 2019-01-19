import java.util.Scanner;
public class Main{
	public static void main(String []args)
	{
		int t;
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		while(t >0)
		{
			int h=0;
			String s = input.next();
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(c == 'A' || c == 'D'|| c == 'O'|| c == 'P'||c == 'R' || c == 'Q')
					h++;
				else if(c == 'B')
					h +=2;
			}
			System.out.println(h);
			t--;
		}
	}
}
