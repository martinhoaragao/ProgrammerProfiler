import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(reader.readLine());
		int i=0,N=0,a=0,b=0;
		String[] ins=null;
		for(i=0;i<T;i++)
		{
			N=Integer.parseInt(reader.readLine());
			int sum=0;
			while(N>0)
			{
				ins=reader.readLine().split(" ");
				a=Integer.parseInt(ins[0]);
				b=Integer.parseInt(ins[1]);
				sum=sum+a-b;
				N--;
			}
			System.out.println(sum);
		}

	}

}
