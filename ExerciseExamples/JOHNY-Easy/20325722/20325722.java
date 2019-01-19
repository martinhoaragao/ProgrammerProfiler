import java.io.* ;
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	    StringBuffer result_string = new StringBuffer() ;
	    int t = 0 ;
	    
	    try {
	        t = Integer.parseInt(br.readLine()) ;
	    } catch(IOException ex) {
	        System.err.println("Problem with input testcases") ;
	        ex.printStackTrace() ;
	    }
	    
	    for(int a = 0 ; a < t ; a++){
	        StringTokenizer st = new StringTokenizer("") ;
	        
	        int number_songs = 0 ;
	        
	        // Input the number of songs 
	        try{
	            number_songs = Integer.parseInt(br.readLine()) ;
	        } catch(IOException ex) {
	            System.err.println("Problem with number of songs") ;
	            ex.printStackTrace() ;
	        }
	        
	        // Input all the songs
	        try {
	            st = new StringTokenizer(br.readLine()) ;
	        } catch(IOException ex) {
	            System.err.println("Problem with songs input") ;
	            ex.printStackTrace() ;
	        }
	        
	        // declaring array for storing all the song lengths
	        int [] array = new int[number_songs] ;
	        int i = 0 ;
	        
	        while(st.hasMoreTokens()) {
	            array[i++] = Integer.parseInt(st.nextToken()) ;
	        }
	        
	        // Input the initial index of "Uncle Johny"
	        int initial_index = -1 ;
	        try{
	            initial_index = Integer.parseInt(br.readLine()) ;
	        } catch(IOException ex) {
	            System.err.println("Problem with initial_index input") ;
	            ex.printStackTrace() ;
	        }
	        
	        int element_at_index = array[initial_index-1] ;
	        
	        // sorting the array
	        Arrays.sort(array) ;
	        
	        // searching for the final_index of the element
	        int final_index = Arrays.binarySearch(array, element_at_index) + 1;
	        
	        result_string.append(final_index + "\n") ;
	    }
	    
	    System.out.println(result_string.toString()) ;
	    
	    try{
	        br.close() ;
	    } catch(IOException ex) {
	        System.err.println("Problem with closing resource") ;
	        ex.printStackTrace() ;
	    }
	}
}