import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class numbers {    
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
            int sum=0 ;
		int testcase=Integer.parseInt(br.readLine());
		
for(int j=0;j<testcase;j++)
{
String holidays=br.readLine();
char [] holes=new char [holidays.length()];
		holes=holidays.toCharArray();
	for(int i=0;i<holes.length;i++)
	{
		if(holes[i]=='A' ||holes[i]== 'D' ||holes[i]== 'O' ||holes[i]== 'P' ||holes[i]== 'Q' ||holes[i]== 'R')
			sum=sum+1;
		else if(holes[i]=='B')
			sum=sum+2;

	}
System.out.println(sum);
holidays=" ";
sum=0;

	}
	}
	catch(Exception e)
{
}
	}
	}
