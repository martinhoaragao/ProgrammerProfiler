import java.io.BufferedReader;
import java.io.InputStreamReader;
class LifeUniverse
{
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
		  int a=Integer.parseInt(br.readLine());
		  if(a!=42)
		  	System.out.println(a);
		  else
		  	break;
		}

	}
}