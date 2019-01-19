import java.util.Scanner;


public class Main{
	
	public static void main(String []args) throws java.lang.Exception{
		
		Scanner in=new Scanner(System.in);
		
	    int test=in.nextInt();
	    while(test>0){
	    	String word=in.next();
	    	int count=0;
	    	for(int i=0;i<word.length();i++){
	    		if(word.charAt(i)=='A'||word.charAt(i)=='D'||word.charAt(i)=='O'||
	    				word.charAt(i)=='P'||word.charAt(i)=='Q'||word.charAt(i)=='R'){
	    			count++;
	    		}
	    		if(word.charAt(i)=='B'){
	    			count+=2;
	    		}
	    	}
	    	System.out.println(count);
	    	test--;
	    }
		
	
	}
}
