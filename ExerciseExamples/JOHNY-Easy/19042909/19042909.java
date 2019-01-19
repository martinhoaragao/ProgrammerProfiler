import java.util.*;
import java.lang.Math.*;
 
class Main{
	
	public static int power(int n, int i){ 
			if(i==0)
				return 1;
			else 
				return n * power(n,i-1);
	}
	public static void main(String []args){		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
			int N = sc.nextInt();
			int j;
			long[] S = new long[N];
			for(int i = 0; i<N; i++){
				S[i] = sc.nextInt();
			}
			int fav = sc.nextInt() - 1;
			long uj = S[fav];
			Arrays.sort(S);
			for(j = 0; j<N && S[j]!=uj; j++);
			System.out.println(++j);
			T--;
		}
		
		
			
	}
}  