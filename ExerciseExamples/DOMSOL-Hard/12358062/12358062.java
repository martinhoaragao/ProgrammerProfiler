import java.util.Scanner;


class INOI2008A {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tiles[][] = new int[2][N];
		for(int i=0;i<2;i++){
			for(int j=0;j<N;j++){
				tiles[i][j] = sc.nextInt();
			}
		}
		if(N == 1){
			System.out.println(Math.abs(tiles[0][0] - tiles[1][0]));
		}
		// 1st column for vertical and 2nd for horizontal
		else{
			int dp[][] = new int[N][2];
			dp[0][0] = Math.abs(tiles[0][0] - tiles[1][0]);
			dp[0][1] = Math.abs(tiles[0][0] - tiles[0][1]) + Math.abs(tiles[1][0] - tiles[1][1]);
			dp[1][0] = dp[0][0] + Math.abs(tiles[0][1] - tiles[1][1]);
			if(N == 2){
				System.out.println(Math.max(dp[0][1] , dp[1][0]));
				System.exit(0);
			}
			else if(N>2){
				dp[1][1] = dp[0][0] + Math.abs(tiles[0][1] - tiles[0][2]) + Math.abs(tiles[1][1] - tiles[1][2]);
			}
			for(int i=2;i<N;i++){
				dp[i][0] = Math.abs(tiles[0][i] - tiles[1][i]) + Math.max(dp[i-1][0], dp[i-2][1]);
				if(i+1 != N){
					dp[i][1] = Math.max(dp[i-1][0],dp[i-2][1]) + Math.abs(tiles[0][i] - tiles[0][i+1])+ Math.abs(tiles[1][i] - tiles[1][i+1]);
				}
			}
		
			System.out.println(Math.max(dp[N-1][0], dp[N-2][1]));
		}
	}
}
