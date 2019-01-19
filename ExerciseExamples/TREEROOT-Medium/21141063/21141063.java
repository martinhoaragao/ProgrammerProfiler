import java.util.*;
class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tcases=sc.nextInt();
		while(tcases-->0) {
			int n=sc.nextInt();
			int ans=0;
			for(int j=0;j<n;j++) {
				int node=sc.nextInt();
				int sum=sc.nextInt();
				ans=ans+node-sum;
			}
			System.out.println(ans);
		}
	}

}
