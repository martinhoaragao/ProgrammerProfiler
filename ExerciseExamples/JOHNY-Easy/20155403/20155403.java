import java.util.Scanner;
import java.util.Arrays;
class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		while(t-->0)
		{
			int a=scanner.nextInt();
			int ar[]=new int[a];
			for(int i=0;i<a;i++)
			{
				ar[i]=scanner.nextInt();
			}
			int m=scanner.nextInt();
			int element=ar[m-1];
			Arrays.sort(ar);
			for(int i=0;i<ar.length;i++)
			{
				if(element==ar[i])
				{
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}