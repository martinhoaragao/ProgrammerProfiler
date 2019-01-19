import java.io.BufferedReader;
import java.io.InputStreamReader;

 
class DoubleString{
  public static void main(String[] args){
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	  try{
		  int t = Integer.parseInt(br.readLine());
	      while(t > 0)
			{
				int n=Integer.parseInt(br.readLine());
				if(n%2==0)
				{
					System.out.println(n);
				}
				else
				{
					System.out.println(n-1);
				}
				
				--t;
			}
	  
	  }
	  catch (Exception e) {	
		  System.out.println(e.getMessage());
	  }
  }
 
}  

