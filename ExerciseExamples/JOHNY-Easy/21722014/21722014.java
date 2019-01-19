import java.util.*;
class UncleJohnny{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			t--;
			int n = sc.nextInt();
			int[] arr = new int[n+1];
			arr[0] = 0;
			int value = 0;
			for(int i=1; i<n+1; i++){
				arr[i]  =sc.nextInt();
			}
			int k = sc.nextInt();
			value = arr[k];
			int count = 1;
			for(int i=1; i<n+1; i++){
				if(value > arr[i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}