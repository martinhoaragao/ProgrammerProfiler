import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0)
		{
			int num=sc.nextInt();
			int tot=0;
			for(int i=0;i<num;i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				tot=tot+a-b;
				
			}
			System.out.println(tot);
			test--;
		}

	}

}
