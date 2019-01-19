import java.util.Scanner;
import java.util.Arrays;
class Soln{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int A[] = new int[n];
			for(int i=0;i<n;i++)
				A[i] = sc.nextInt();

			int in_index = sc.nextInt();
			int in_val = A[in_index-1];
			Arrays.sort(A);
			int i;
			int ans=0;
			for(i=0;i<n;i++)
				if(in_val==A[i])
					//ans=i;
					break;
			System.out.println(i+1);	
			
		}
	}	
}