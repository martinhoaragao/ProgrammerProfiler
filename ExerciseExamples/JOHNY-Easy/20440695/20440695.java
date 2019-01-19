/*Simple code!*/
import java.util.*;
class trial{
	public static void main(String [] args){
		Scanner ins = new Scanner(System.in);
		int test= ins.nextInt();
		while(test!=0){
			test--;
			int n=ins.nextInt();
			int entry[]=new int[n];
			for(int i=0;i<n;i++){
				entry[i]= ins.nextInt();
			}
			int k= ins.nextInt()-1;
			int show= entry[k];
			Arrays.sort(entry);
			int ans = Arrays.binarySearch(entry, show);
			System.out.println(ans+1);
			
		}
	}
}
