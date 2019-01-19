import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		for(int t_i=0;t_i<t;t_i++)
		{
			int n=obj.nextInt();
			int root=0;
			for(int i=0;i<n;i++)
			{
				root+=obj.nextInt();
				root-=obj.nextInt();
			}
			System.out.println(root);
		}
	}
}