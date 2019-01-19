import java.util.Scanner;

class UncleJohnny {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase > 0){
			int num = sc.nextInt();
			double[] a = new double[num];
			for(int i = 0; i < num; i++){
				a[i] = sc.nextDouble();
			}
			double uncle = a[sc.nextInt()-1];
			mergeSort(a, 0, num-1);
			System.out.println(binarySearch(a, 0, num-1, uncle)+1);
			testcase--;
		}
	}
	static void mergeSort(double[] a, int l, int r){
		if(l < r){
			int m = l+(r-l)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			merge(a, l, m, r);
		}
	}
	static void merge(double[] a, int l, int m, int r){
		int n1 = m-l+1;
		int n2 = r-m;
		
		double[] left = new double[n1];
		double[] right = new double[n2];
		
		for(int i = 0; i < n1; i++)
			left[i] = a[l+i];
		for(int j = 0; j < n2; j++)
			right[j] = a[m+1+j];
		
		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2){
			if(left[i] <= right[j]){
				a[k] = left[i];
				k++; i++;
			}
			else{
				a[k] = right[j];
				k++; j++;
			}
		}
		while(i < n1){
			a[k] = left[i];
			k++; i++;
		}
		while(j < n2){
			a[k] = right[j];
			k++; j++;
		}
	}
	static int binarySearch(double[] a, int l, int r, double uncle){
		int m = l + (r-l)/2;
		
		if(uncle == a[m]){
			return m;
		}
		else if (uncle < a[m]){
			return binarySearch(a, l, m-1, uncle);
		}
		else{
			return binarySearch(a, m+1, r, uncle);
		}
	}
	static void print(double[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}
