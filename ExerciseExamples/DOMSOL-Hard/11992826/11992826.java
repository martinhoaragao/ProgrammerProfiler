import java.util.Scanner;
 
class maxscoretiling {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[][]=new int[2][n];
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}for(i=0;i<2;i++)
	{
		for(j=0;j<n;j++)
		{
		//	System.out.print(a[i][j]);
		}
		//System.out.println();
	}
	System.out.println(find(a,n,0,0,0));
}
static int score=0;static int score2=0;
public static int find(int a[][],int n,int s1,int s2,int s21)
{
	int sc1=0,sc2=0;
	if (n<0)return 0;
	int r[]=new int[n+1];
	int i;
	r[0]=0;
	r[1]=Math.abs(a[0][0]-a[1][0]);
	for(i=2;i<=n;i++)
	{

		sc1=Math.abs(a[0][i-1]-a[1][i-1]);
		 s2=Math.abs(a[0][i-1]-a[0][i-2]);
			s21=Math.abs(a[1][i-1]-a[1][i-2]);
			sc2=s2+s21;
		r[i]=Math.max(r[i-1]+sc1, r[i-2]+sc2);
		//System.out.println(i);

	}
	
 
	
	 
	return r[n];
}/*public static int find(int a[][],int n,int s1,int s2,int s21)
{
	int sc1=0,sc2=0;
	if (n<0)return 0;
	
	sc1=Math.abs(a[0][n]-a[1][n])+find(a,n-1,0,0,0);
	if(n>=1){
	 s2=Math.abs(a[0][n]-a[0][n-1]);
	s21=Math.abs(a[1][n]-a[1][n-1]);
	sc2=s2+s21+find(a,n-2,0,0,0);}
	//System.out.println(s1+" "+s2+" "+s21);
 
	
	 
	return Math.max(sc1, sc2);
}*/
}
 