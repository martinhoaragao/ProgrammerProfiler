import java.util.Scanner; 
public class Main {
	
	public static void main(String[] args) {

		
		Scanner sc =new Scanner (System.in) ;
		int testes =sc.nextInt() ;
		while(testes!=0)
		{
			int n=sc.nextInt() ;
			if (n%2==0)
			{
				System.out.println(n);
			}
			else{
				
				System.out.println(n-1);

			}
			
			
			
			
			
			testes-- ;
		}
		
	}
	}