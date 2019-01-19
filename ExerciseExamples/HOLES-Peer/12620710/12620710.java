import java.lang.*;
import java.util.*;

class Main{

  public static void main(String[] args) {

    int cases;
    int count = 0;
  	String text;

  	Scanner sc = new Scanner(System.in);
    cases = sc.nextInt();

  	while(cases != 0)
  	{
  		text = sc.next();
  		count = 0;

  		for( int i = 0 ; i < text.length() ; i++ )
  		{
  				char a = text.charAt(i);

  				if( a == 'A' || a == 'D' || a == 'O' || a == 'P' || a == 'Q' || a == 'R')
  						count++;

  				else if( a == 'B')
  						count += 2;

  		}

  		System.out.println(count);

  		cases--;
  	}


  }

}