import java.util.Scanner;
 class Coins {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			//int[] arr = new int[n+1];
			long ans = getCoins(n);
			System.out.println(ans);
			sc.nextLine();
		}
		sc.close();
	}
	
	public static long getCoins(int n) {
		if(n==0 || n==1 || n==2 || n==3 || n==4)
			return n;
		
		else if(n/2 + n/3 + n/4 > n)
			return Math.max(n/2, getCoins(n/2)) + Math.max(n/3, getCoins(n/3)) + Math.max(n/4, getCoins(n/4));
		return n;
	}

}
