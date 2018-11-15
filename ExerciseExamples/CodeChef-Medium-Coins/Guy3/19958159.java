import java.util.Scanner;

class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int[] a = new int[1000000001];
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			System.out.println(maximize(n));
		}
	}
	
	public static long maximize(int n){
		//if(a[n]!=0){
		//	return a[n];
		//}
		if(n<12){
			//a[n] = n;
			return n;
		}else{
			long ans = maximize(n/2)+maximize(n/3)+maximize(n/4);
			return ans;
		}
		
	}
}













