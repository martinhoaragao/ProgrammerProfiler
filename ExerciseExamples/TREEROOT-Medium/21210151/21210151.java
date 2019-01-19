import java.util.Scanner;
 class treeIDSum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for(int j=0 ; j<t ; j++){
	int n=s.nextInt();
	int ans=0;
	for(int i=0 ; i<n ; i++) {
		int id=s.nextInt();
		int sum=s.nextInt();
		ans=ans+id-sum;
	}
	System.out.println(ans);
	}
}
}