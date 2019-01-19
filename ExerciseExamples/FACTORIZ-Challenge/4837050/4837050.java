import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

class FACTORIZ {
	public static void main(String[] args)  throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t =   Integer.parseInt(in.readLine(),10);
										   
		while(t-->0)
		{
			BigDecimal b = new BigDecimal(in.readLine());
			System.out.println("1");
			System.out.println(b);
		}

	}

}
