import java.util.Scanner;


public class Main {
	
	static int[] indexTree = new int[30000000];
	
	static int ceilPow2;
	
	public static void initTree(int n){
		for(ceilPow2 = 1;ceilPow2 < n;ceilPow2 *= 2);
		int i = 0;
		for(; i < n; i++) indexTree[ceilPow2 + i] = 1;
		for(; i < ceilPow2; i++) indexTree[ceilPow2 + i] = 0;
		for(int j= ceilPow2 - 1;j>0;j--) indexTree[j] = indexTree[2 * j] + indexTree[2 * j + 1];
	}
	
	public static int getRank(int insertionPosition){
		int root = 1;
		while(root < ceilPow2){
			indexTree[root]--;
			if(insertionPosition <= indexTree[2 * root]) root = 2 * root;
			else { insertionPosition -= indexTree[2 * root];root = 2 * root + 1;}
		}
		indexTree[root] = 0;
		return root - (ceilPow2 - 1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nTest = s.nextInt();
		while (nTest-- > 0) {
			int n = s.nextInt();
			int[] soliders = new int[n + 1];
			for(int i = 1;i<=n;i++){
				soliders[i] = s.nextInt();
			}
			initTree(n);
			for(int j = n;j> 0 ; j--) soliders[j] = getRank(j - soliders[j]);
			System.out.print(soliders[1]);
			for(int i = 2;i<soliders.length;i++)System.out.print(" " + soliders[i]);
			System.out.println();
		}
	}
}