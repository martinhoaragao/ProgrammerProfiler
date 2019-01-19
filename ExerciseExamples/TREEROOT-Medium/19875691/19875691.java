

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class TREEROOT {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int nnodes=sc.nextInt();
			int root=0;
			while(nnodes-->0) {
				int id=sc.nextInt();
				int childSum=sc.nextInt();
				root+=id-childSum;
			}
			
			System.out.println(root);
		}

	}

}
