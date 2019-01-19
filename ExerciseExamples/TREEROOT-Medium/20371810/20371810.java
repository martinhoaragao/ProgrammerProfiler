import java.util.*;
class TREEROOT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int ans=0;
			for(int j=0;j<n;j++) {
				int node=s.nextInt();
				int sum=s.nextInt();
				ans=ans+node-sum;
			}
			System.out.println(ans);
		}
	}

}
