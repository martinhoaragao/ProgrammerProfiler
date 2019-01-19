

import java.util.*; 
class trycode {
	
	

	
	
	public static void main(String[] args){
		
		
		Scanner inp=new Scanner (System.in);
		int total=Integer.parseInt(  inp.nextLine());
	
		for(int i=0;i<total;i++){
			
		int len=Integer.parseInt(  inp.nextLine());
		
		if(len%2==0)
			System.out.println(len);
		else
			System.out.println(len-1);
	}
	
	
	
	
}}
