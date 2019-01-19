
import java.io.BufferedReader;
import java.io.InputStreamReader;


 class TestAcces {

	public static void main(String[] args) throws Exception{
		     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		     int t,strn;
		   
		   
		     t=Integer.parseInt(bf.readLine());
		     
		     for(int i=0;i<t;i++){
		    	 strn = Integer.parseInt(bf.readLine());
		    	 if((strn&1)==1){
		    		 System.out.println(strn-1);
		    	 }
		    	 else
		    		 System.out.println(strn);
		    		 
		    	 
		    	 
		     }
             
		     
	}

	
}
