
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class AtleastCopy {

	public static HashMap<Long, Long> hm = new HashMap<Long, Long>();  
	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;
	while((input = br.readLine())!=null){
		long n = Long.parseLong(input);
		System.out.println(findCoins(n));
		}
	}
	static long findCoins(long n)
	{
		long result=0;
		if(hm.get(n)!=null){
			return hm.get(n);
		}
		else if(n<12){
			result=n;
		}
		else if(n>=12){
			result= findMax(n,findCoins((n/2))+findCoins((n/3))+findCoins((n/4)));
		}
		hm.put(n, result);
		return result;
	}
	static long findMax(long m,long n)
	{
		if(m>=n) return m;
		else return n;
		
	}
}