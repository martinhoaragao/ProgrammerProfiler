import java.util.ArrayList;
import java.util.Scanner;

class LifeUniverseProblem {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> out=new ArrayList<Integer>();
		int input=Integer.parseInt(sc.nextLine());
	    while(input!=42)
	    {
	    	out.add(input);
	    	input=Integer.parseInt(sc.nextLine());	    	
	    	
	    }
	    
	    System.out.println("");
	    for(int i=0;i<out.size();i++){
	    	
	    	System.out.println(out.get(i));
	    }
		
	    sc.close();
	}
}