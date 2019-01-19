import java.util.*;

class treeroot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n , id , sid ,diff , x , i; 
		while(t!=0)
		{	
			diff = 0;
			n = sc.nextInt();
			for(i=0;i<n;i++)
			{
				id = sc.nextInt();
				sid = sc.nextInt();
				diff = diff + (id - sid);
			}
			System.out.println(diff);

			t--;
		}
	}
}