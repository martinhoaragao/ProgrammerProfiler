import java.util.Scanner;

class Bytelandcoin {
             static long max_coin(long Coin_value)
             {   long Byte_coin;
                 if(Coin_value<12)
         	    {
         	    	return Coin_value;
         	    }else {
               	  Byte_coin= max_coin(Coin_value/2) + max_coin( Coin_value/3) + max_coin( Coin_value/4);         	  
         	    }
				return Byte_coin;
				
            	 
             }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
       
        for(int i=0;i<10;i++)
		{long Coin_value =in.nextLong();
                 System.out.println( max_coin(Coin_value));
		}
	
	}

}
