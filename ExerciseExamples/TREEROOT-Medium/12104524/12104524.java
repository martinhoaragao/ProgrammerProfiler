import java.util.Scanner;
class Root_of_the_Problem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,n,sum1,sum2;
		t=sc.nextInt();
		while(t>0)
			{
			sum1=sum2=0;
			n=sc.nextInt();
			while(n>0)
				{
				sum1+=sc.nextInt();
				sum2+=sc.nextInt();
				n--;
				}
			System.out.println(sum1-sum2);
			t--;
			}
		sc.close();
		}
	}