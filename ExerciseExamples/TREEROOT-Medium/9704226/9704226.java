import java.io.IOException;
import java.util.Scanner;
class BinaryTree 
{

	public static void main(String []args)throws IOException
	{
		Scanner kb=new Scanner(System.in);
		short t=kb.nextShort();
		while(t>0)
		{
			short n=kb.nextShort();
			int s1=0;
			int s2=0;
			while(n-->=1)
			{
				s1+=kb.nextInt();
				s2+=kb.nextInt();
				
				
				
				
				
			}
			System.out.println(s1-s2);
			t--;
			
			
			
		}
		
		
	}
	
	
	
	
}
