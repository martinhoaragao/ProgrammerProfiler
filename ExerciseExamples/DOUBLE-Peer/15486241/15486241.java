import java.util.*;
class doublecc{
	public static void main(String[] ar){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int n;
	for(int i=0;i<t;i++)
	{
		n=sc.nextInt();
		if(n%2==0)
			System.out.println(n);
		else
			System.out.println(n-1);
	}
	}
}