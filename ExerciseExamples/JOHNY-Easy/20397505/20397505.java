import java.util.*;

class Sol{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			int b = sc.nextInt();
			int[] a = new int[b];
			
			for(int j=0;j<b;j++){
				a[j] = sc.nextInt();
			}
			int k = sc.nextInt();
			k = a[k-1];
			int c = 0;
			
			for(int j=0;j<b;j++){
				
				if(a[j]<k){
					c++;
				}
				
			}
			System.out.println(c+1);
		}
		
	}

}