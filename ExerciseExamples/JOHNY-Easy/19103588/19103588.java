import java.util.*;
class JOHNY{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int t,i,n,k,pre,j,in;
		t=s.nextInt();
		int[] ans=new int[t];
		for(i=0;i<t;i++){
			n=s.nextInt();
			int[] a=new int[n];
			for(j=0;j<n;j++){
				a[j]=s.nextInt();
			}
			k=s.nextInt();
			pre=a[k-1];
			Arrays.sort(a);
			for(j=0;j<n;j++){
				if(pre==a[j]){
					break;
				}
			}
			ans[i]=j+1;
		}
		for(i=0;i<t;i++){
			System.out.print(ans[i]);
			if(i!=t-1){
				System.out.println();
			}
		}
	}
}