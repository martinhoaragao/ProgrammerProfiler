import java.util.Scanner;
public class Main{
   public static void main (String[] args){
      		      Scanner in  = new Scanner(System.in);
		      int tc = Integer.parseInt(in.next());
		      while(tc > 0 ){
		    	  int n = Integer.parseInt(in.next());	  
		    	  if(n % 2 == 0){
		    		  System.out.println(n);
		    	  }else{
		    		  System.out.println(--n);
		    	  }
		    	  tc--;
		      }
   }
 }