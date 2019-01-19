import java.util.Scanner;
class CodeChefHolesinthetext {
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
		int tCase=scan.nextInt();
		
		
		while(tCase--!=0)
		{
			int count=0;
			String s= scan.next();
			for(int i = 0 ;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
					count++;
				if(ch=='B')
					count+=2;
				
			}
			System.out.println(count);
			
		}
		
		scan.close();
		
	}
}


