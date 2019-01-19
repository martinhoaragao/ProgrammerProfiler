import java.util.Scanner;

class ara{
	public static void main(String [] args){
		Scanner amk = new Scanner(System.in);
		int t = amk.nextInt();
		String s;
		int count=0;
		for(int i=0;i<t;i++)
		{   count=0;
			s=amk.next();
			for(int j=0;j<s.length();j++)
			{       if(s.charAt(j)=='A'|s.charAt(j) == 'D' ||
						s.charAt(j) == 'O' || s.charAt(j) == 'P' || s.charAt(j) == 'Q' || s.charAt(j) == 'R'){
					                count++; }
				    else if(s.charAt(j)=='B'){
					count=count+2; }
				
				
			}
			System.out.println(count);
		}
	}
}