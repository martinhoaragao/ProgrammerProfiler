import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

 class TestAcces {

	public static void main(String[] args) throws Exception{
		     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		     int t,n,strn;
		   
		   
		     t=Integer.parseInt(bf.readLine());
		     
		     for(int i=0;i<t;i++){
		    	 strn = Integer.parseInt(bf.readLine());
		    	 if(strn%2==0){
		    		 System.out.println(strn);
		    	 }
		    	 else
		    		 System.out.println(strn-1);
		    		 
		    	 
		    	 
		     }
             
		     
	}

	
}
