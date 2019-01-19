import java.util.*;
class Uncle{
	public static void main(String args[]){
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		for(int l=1;l<=t;l++){
			int n=scan.nextInt();
			int A[]=new int[n];
			for(int i=0;i<n;i++){
				A[i]=scan.nextInt();
			}
			int k=scan.nextInt();
			k=k-1;
			int ans=A[k];
			Arrays.sort(A);
			for(int i=0;i<n;i++){
				if(A[i]==ans){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}