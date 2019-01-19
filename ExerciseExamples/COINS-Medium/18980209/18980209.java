
import java.util.*;
class temp {
         public static long COINS(long n){
			if(n>11)
   		      return(COINS(n/2)+COINS(n/3)+COINS(n/4));
		       else
		        return n;
	}		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
         	while(sc.hasNext()){
		   System.out.println(COINS(sc.nextLong()));
		}   
	}

}
