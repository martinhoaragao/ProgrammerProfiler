

import java.util.Scanner;

class Demo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int j=0; j<n; j++){
				a[j] = scan.nextInt();
			}
			int k = scan.nextInt();
			int l = partition(a, 0, n-1, k-1);
			System.out.println(l+1);
		}
		scan.close();
	}
	public static int partition(int[] a, int start, int end, int l) {
		int i = start, j=end;
		while(i<j) {
			while(i<=l && a[i]<=a[l]) {
				i++;
			}
			if(i != l+1) {
				int temp = a[l];
				a[l] = a[i];
				a[i] = temp;
				l = i;
			}
			while(j>=l && a[j]>=a[l]) {
				j--;
			}
			if(j != l-1) {
				int temp = a[l];
				a[l] = a[j];
				a[j] = temp;
				l = j;
			}
		}
		return l;
	}
}
