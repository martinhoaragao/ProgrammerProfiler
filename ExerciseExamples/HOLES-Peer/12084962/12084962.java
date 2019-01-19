
import java.util.Scanner;

class HOLES {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(),result;
		String mot;
		while(T-->0)
		{
			result = 0;
			mot = in.next();
			mot = mot.toUpperCase();
			for(int i =0;i<mot.length();i++)
				{
				if(mot.charAt(i)=='A' 
				|| mot.charAt(i)=='D' || mot.charAt(i)=='O' 
				|| mot.charAt(i)=='P' || mot.charAt(i)=='Q' || 
				mot.charAt(i)=='R' ) result++;
			    if( mot.charAt(i)=='B') result+=2;
				}
			System.out.println(result);
				
		}
		in.close();
		

	}//END MAIN

}//END CLASS
