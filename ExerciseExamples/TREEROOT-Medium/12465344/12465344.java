import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

class ROOT_OF_THE_TREE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		OutputStream out=new BufferedOutputStream(System.out);
		int ssum=0,idsum=0;
		
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			while(n--!=0)
			{
				idsum+=sc.nextInt();
				ssum+=sc.nextInt();
			}
			out.write((idsum-ssum+"\n").getBytes());
			idsum=ssum=0;
		}
		out.flush();
		sc.close();
		
	}

}
