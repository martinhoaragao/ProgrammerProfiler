import java.lang.*;
import java.util.*;
 
class strc{
 
  public static void main(String[] args) {
 
    int t;
    int cnt = 0;
  	String te;
 
  	Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
 
  	while(t != 0)
  	{
  		te = sc.next();
  		cnt = 0;
 
  		for( int i = 0 ; i < te.length() ; i++ )
  		{
  				char a = te.charAt(i);
 
  				if(a == 'A' || a == 'D' || a == 'O' || a == 'P' || a == 'Q' || a == 'R')
  						cnt++;
 
  				else if( a == 'B')
  						cnt += 2;
 
  		}
 
  		System.out.println(cnt);
 
  		t--;
  	}
 
 
  }
 
}