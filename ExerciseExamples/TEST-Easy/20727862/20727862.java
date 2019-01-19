import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int  n = 0;
		do 
		{
			n = sc.nextInt();
			if ( n != 42)
			{
				al.add(n);
			}
		}
		while(n!=42);
		
		for (int a : al)
		{
			System.out.println(a);
		}
		
	}
}