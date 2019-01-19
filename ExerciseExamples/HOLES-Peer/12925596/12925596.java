import java.util.Scanner;


 class chararry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scr= new Scanner(System.in);
	int val;
	int T=scr.nextInt();
	
	for(int i=0;i<T;i++){
	val=0;
		String input=scr.next();
	char[] input2= input.toCharArray();
	for(char temp: input2){
	if( temp=='A' ||temp=='D' ||temp=='Q' ||temp=='P' ||temp=='R'|| temp=='O' ){
		val++;
	}
	else if(temp=='B'){
		val=val+2;
	}	
	}
	System.out.println(val);
	
	}
	}


}