import java.io.* ;

public class Main
{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int t = 0 ;
		
		try{
		    t = Integer.parseInt(br.readLine()) ;
		} catch(IOException ex) {
		    System.out.println("Somethings wrong with testcase input");
		    ex.printStackTrace() ;
		}
		
		String str = new String();
		
		for(int a = 0 ; a < t ; a++) {
		    try{
		        str = br.readLine() ;
		    } catch(IOException ex){
		        System.out.println("Somethings wrong with the input") ;
		        ex.printStackTrace() ;
		    }
		    int total_count = 0 ;
		    for(char c : str.toCharArray()) {
		        switch(c) {
		            case 'A':
		            case 'D':
		            case 'O':
		            case 'P':
		            case 'Q':
		            case 'R':
		                total_count++ ;
		                break ;
		            case 'B':
		                total_count += 2 ;
		                break ;
		        }
		    }
		    System.out.println(total_count);
		}
	}
}
