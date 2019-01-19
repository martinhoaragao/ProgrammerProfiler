import java.util.*;
class Holes
{
	public static void main(String args[])
	{
		//Console con=System.console();
		int T;
		//T=Integer.parseInt(con.readLine());
		Scanner scan=new Scanner(System.in);
                T=Integer.parseInt(scan.nextLine());
		//System.out.println(T);
		
		int holes;
		for(int t=0;t<T;t++)
		{
			String arr;
			holes=0;
			char a[]=new char[102]; 
			arr=new String(scan.nextLine());
			a=arr.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				switch(a[i])
				{
					case 'A':
						holes++;
						break;
					case 'B':
						holes+=2;
						break;
					case 'D':
						holes++;
						break;
					case 'O':
						holes++;
						break;
					case 'P':
						holes++;
						break;
					case 'R':
						holes++;
						break;
					case 'Q':
						holes++;
						break;
				}
			}
			System.out.println(holes);	
		}
	}
}		