import java.io.*;
import java.util.*;

 class COINS {

	public static long countCoins(long x){
    	if(x<12){
    		return x;
    	}else{
    		return countCoins(x/2)+countCoins(x/3)+countCoins(x/4);
    	}
    	
    
    }
	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException{
			    long n=0;
			    long res;
			    
			    
			    //int testcases=0;
			    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			    //int testcases = Integer.parseInt(br.readLine());
			    for(int i=0;i<10;i++){
			      n=Long.parseLong(br.readLine());
			      res=countCoins(n);
			      
	/*		      res=n/2+n/3+n/4;
			      if(res<n)
			        res=n;
	*/		       System.out.println(res);
			    }
			  }

		
}