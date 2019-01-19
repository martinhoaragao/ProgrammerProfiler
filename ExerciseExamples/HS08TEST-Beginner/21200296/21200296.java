import java.util.Scanner;

class ATM 
{
	public static void main( String args[] )
	{
		Scanner scanner = new Scanner( System.in );
		
		int iAmtToWithdraw = Integer.parseInt( scanner.next() );
		double dBalance = Float.parseFloat( scanner.next() );
		
		scanner.close();
		
		double dAmtToDeduct = 0;
		
		if ( iAmtToWithdraw % 5 == 0  )
		{
			dAmtToDeduct = iAmtToWithdraw + 0.5;
			
			if ( dAmtToDeduct <= dBalance )
				dBalance = dBalance - dAmtToDeduct;
		}
		
		
		
		System.out.printf( "%.2f",dBalance );
	}
}