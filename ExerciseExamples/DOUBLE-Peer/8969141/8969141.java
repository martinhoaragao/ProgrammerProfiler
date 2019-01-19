import java.io.InputStream;
import java.util.Scanner;

 class TestAcces {

	public static void main(String[] args){
		     Scanner sc = new Scanner(System.in);
		     int t,n,strn;
		   
		   
		     t=sc.nextInt();
		     
		     for(int i=0;i<t;i++){
		    	 strn = sc.nextInt();
		    	 if(strn%2==0){
		    		 System.out.println(strn);
		    	 }
		    	 else
		    		 System.out.println(strn-1);
		    		 
		    	 
		    	 
		     }
             
		     
	}

	
}
