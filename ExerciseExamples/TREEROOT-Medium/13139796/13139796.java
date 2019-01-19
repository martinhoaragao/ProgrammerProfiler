import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int id,root,sum,t=sc.nextInt();
		while(t-->0){
			root=0;
		int n=sc.nextInt();
			while(n-->0){
				id=sc.nextInt();
				sum=sc.nextInt();
				root+=(id-sum);
			}
			System.out.println(root);
		}
		sc.close();
	}
}