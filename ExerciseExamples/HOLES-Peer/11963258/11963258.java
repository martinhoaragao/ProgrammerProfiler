import java.util.Scanner;

class HolesInText {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t;
      t = sc.nextInt();
      while(t-->0) {
    	  String s = sc.next();
    	  int count = 0;
    	  for(int i = 0; i<s.length(); i++) {
    		  if(s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'O' || s.charAt(i) == 'R' || s.charAt(i) == 'Q' || s.charAt(i) == 'P') {
    			count++;  
    		  }
    		  else if(s.charAt(i) == 'B')
    			  count = count+2;
    	  }
    	  System.out.println(count);
    	  }
      sc.close();
    	  }
}