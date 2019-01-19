import java.util.*;
 class Hoels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;		
int ct;
		for(i=0;i<n;i++){
			String a=sc.next();
		ct=0;
			int len=a.length();
			for(j=0;j<len;j++){
				if(a.charAt(j)=='B')
					ct=ct+2;
				else if(a.charAt(j)=='A' || a.charAt(j)=='D' || a.charAt(j)=='O' || a.charAt(j)=='P' || a.charAt(j)=='Q' || a.charAt(j)=='R')
					ct++;
				
			
			}//for j
			System.out.println(ct);

			
		}//for i
	}

}
