import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
class atm {


	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Scanner me = new Scanner(System.in);

		int T=me.nextInt();


		for (int t=0;t<T;t++)
		{
			int n1=me.nextInt();
			int x;
			int id=0;
			int sum=0;
			for (int i=0;i<n1;i++)
			{
				id=id+me.nextInt();
				sum=sum+me.nextInt();
				
			}
			x=id-sum;
			System.out.println(x);


		}




	}

}






