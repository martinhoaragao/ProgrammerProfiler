import java.util.Scanner;
/*
	Author: Ananthakrishnan D.S.
	Date: 06/08/2016
*/
 class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int holes;
		String a=null;
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String st[]=new String[t+1];
		for(int i=0;i<=t;i++){
			st[i]=sc.nextLine();
			holes=0;
			char ch,f='f';
				for(int j=0;j<st[i].length();j++){
					ch=st[i].charAt(j);
					f='t';
					if(ch=='A' || ch=='O' || ch=='D' || ch=='R' || ch=='P'|| ch=='Q' ){
						holes+=1;
					}
					else{
						if(ch=='B' ){
							holes+=2;
						}
					}
					
					
					
				}
			if(f=='t')
			System.out.println(holes);
			
		
		}
		
	}
}