import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int testCase = scan.nextInt();
	  scan.nextLine();
	  String[] a = new String[testCase];
	  for(int i = 0 ; i < testCase ; i++ ) {
		  String s = scan.nextLine();
		  char[] h = s.toCharArray();
		  int hole = 0;
		  for( int t = 0 ; t < s.length() ; t++) {
			  if ( h[t] == 'B' ) {
				  hole += 2;
			  }
		      else if( h[t] =='A' || h[t] =='D' || h[t] == 'O' || h[t] == 'R' || h[t] =='Q' || h[t] == 'P' ) {
				  hole++;
			  }
		  }
		  System.out.println(hole);
	  }
  }
}