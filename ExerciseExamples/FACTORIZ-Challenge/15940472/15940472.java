import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

class Factorisation 
{
	public static void main(String Sym[])
	{
		Scanner sym = new Scanner(System.in);
		ArrayList<Integer> primelst = new ArrayList<Integer>();
		primelst.add(2);
		
		for (int i = 3; i <= 1200; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				primelst.add(i);
			}
		}
		
		int t = sym.nextInt();

		while(t-->0)
		{
			int count=0;
			String multiple = "";
			
			BigInteger inputVal = new BigInteger(sym.next());
			
			for( int i = 0 ; i < primelst.size() ; i++ )
			{
				BigInteger primelstVal = new BigInteger(primelst.get(i)+"");
				
					while( inputVal.mod(primelstVal).equals(BigInteger.ZERO))
					{
						multiple += primelstVal +"\n";
						inputVal = inputVal.divide(primelstVal);
						++count;
					}
			}
		    if( !inputVal.equals(BigInteger.ONE)) 
		    {
		    	multiple += inputVal + "\n"; 
		    	++count;
		    }
	            System.out.print(count + "\n" + multiple);
		}
	  sym.close();	
	} 
}