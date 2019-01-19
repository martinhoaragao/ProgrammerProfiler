

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
         while(line != null && line != "" && line.length()>0){		
			//String line = br.readLine();
			long no = Long.parseLong(line);
			System.out.println(convertAndExchange(no));
			line = br.readLine();
			}
		}

		public static long convertAndExchange(long no){
			
			long sum = no/2+no/3+no/4;
	
			if(sum<=no) return no;
			else return convertAndExchange(no/2)+convertAndExchange(no/3)+convertAndExchange(no/4);
		}

		}