import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long t,i;
		Scanner scanner = new Scanner(System.in);
		
		t=scanner.nextLong();
		
		for(i=(long) 0;i<t;i++)	
		{
			Long n;
			n=scanner.nextLong();
			
			if(n%2==0)
				System.out.println(n);
			else if(n%2!=0)
				System.out.println(n-1);
			
		}
	}

}
