import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum1,sum2,t=Integer.parseInt(br.readLine()),n;
		String s[];
		for(int i=0;i<t;i++){
		    sum1=sum2=0;
		    n=Integer.parseInt(br.readLine());
		    for(int j=0;j<n;j++){
		        s=br.readLine().split(" ");
		        sum1+=Integer.parseInt(s[0]);
		        sum2+=Integer.parseInt(s[1]);
		    }
		    System.out.println(sum1-sum2);
		}
	}
}
