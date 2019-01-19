import java.io.BufferedReader;
import java.io.InputStreamReader;

class DoubleString
{
	public static void main(String[] args) throws Exception
	{
		int t;
		BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(re.readLine());
	
		while(t-- > 0) {
			long n = Long.parseLong(re.readLine());	
			if(n % 2 == 0) { System.out.println((long)n); }
			else { System.out.println((long)(n-1)); }
		}	
	}
}