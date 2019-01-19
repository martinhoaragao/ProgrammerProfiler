import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Treeroot
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		if(t<1 || t>50)
			return ;
		String[] s;
		for(int i=0; i<t; i++)
		{
			int n=Integer.parseInt(br.readLine());
			if(n<1 || n>30)
				return ;
			int root=0;
			for(int j=0; j<n; j++)
			{
				s=br.readLine().split(" ");
				int a = Integer.parseInt(s[0]);
				if(a<1 || a>1000)
					return ;
				int b = Integer.parseInt(s[1]);
				root+=a-b;
			}
			System.out.println(root);
		}
	}
}