

import java.util.Scanner;

 class Root {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int s1=0,s2=0;
			int a[][]=new int[n][2];
			for(int j=0;j<n;j++)
			{
				a[j][0]=s.nextInt();
				a[j][1]=s.nextInt();
				s1=s1+a[j][0];
				s2=s2+a[j][1];
			}
			System.out.println(s1-s2);
		}
		s.close();

	}

}
