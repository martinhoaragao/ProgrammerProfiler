import java.util.Scanner;


class holiday {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
	    int hole=0,t=sc.nextInt();
	    String n;
	    
	    while(t-->0){
	    	n=sc.next();
	    	hole=0;
	    	for(int i=0;i<n.length();i++){
	    		char test=n.charAt(i);
	    		
	    		if(test=='A'||test=='O'||test=='D'||
	    				test=='P'||test=='Q'||test=='R')
	    			hole++;
	    		else if(test=='B')
	    			hole+=2;
	    	}
	    	System.out.println(hole);	
	    	
	    }
	    
    }
}
