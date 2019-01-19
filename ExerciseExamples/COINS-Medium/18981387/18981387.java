        import java.util.*;
        import java.lang.*;
        import java.io.*;
 
        /* Name of the class has to be "Main" only if the class is public. */
        class Coins
        {
        	private static final Map<Long,Long> coinToDollarMap = new HashMap<>();
 
        	public static void main (String[] args) throws java.lang.Exception
        	{
        		// Scanner sc=new Scanner(System.in);
        		// for (;;) {
        		// 	Long number = sc.nextLong();
        		// 	if (number == null) {
        		// 		break;
        		// 	}
        		// 	System.out.println(compareAndGet(number));
        		// }
        		InputStreamReader inputStreamReader=new InputStreamReader(System.in);    
    			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    			for (;;) {
    				String numberStr = bufferedReader.readLine();
    				if (numberStr == null) {
    					return;
    				}
    				Long number = Long.parseLong(numberStr);
    				System.out.println(compareAndGet(number));
    			}
        	}
 
        	private static long compareAndGet(long num) {
        		Triple initial = new Triple(num);
        		if (num < initial.getByTwo() + initial.getByThree() + initial.getByFour()) {
        			if (coinToDollarMap.containsKey(num)) {
        				return coinToDollarMap.get(num);
        			}
        			long tempNumber = compareAndGet(initial.getByTwo()) + compareAndGet(initial.getByThree()) + compareAndGet(initial.getByFour());
        			coinToDollarMap.put(num, tempNumber);
        			return tempNumber;
        		}
        		return num;
        	}
 
        	public static class Triple {
        		long byTwo;
        		long byThree;
        		long byFour;
 
        		public Triple(long number) {
        			byTwo = number/2;
        			byThree = number/3;
        			byFour = number/4;
        		}
 
        		public long getByTwo() {
        			return byTwo;
        		}
 
        		public long getByThree() {
        			return byThree;
        		}
 
        		public long getByFour() {
        			return byFour;
        		}
        	}
        }