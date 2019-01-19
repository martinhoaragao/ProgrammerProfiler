import java.util.Scanner; 
public class Main {
	
	public static void main(String[] args) {

		
		Scanner sc =new Scanner (System.in) ;
		int testes =sc.nextInt() ;
		int [] array = new int [testes] ;
		int k=0 ;
		while(testes!=0)
		{
			int n=sc.nextInt() ;
			if (n%2==0)
			{
				array[k]=n ;
				k++ ;
			}
			else{
				
				array[k]=n-1 ;
				k++ ;
			}
			
			
			
			
			
			testes-- ;
		}
		for (int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	}