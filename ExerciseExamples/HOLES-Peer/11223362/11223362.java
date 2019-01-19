import java.util.*;
class HOLES{
public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
	int n,i,count;
	char c;
	String s;
	n=input.nextInt();
	
	while(n!=0)
	{s=input.next();
	count=0;
	   for(i=0;i<s.length();i++)
	{c=s.charAt(i);
	switch(c)
	  {
	    case 'A':
            case 'D':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':  count+=1;
	             break;
	             
	   case 'B': count+=2;
	             break;
	   default:  break;
	 }
	
	 }
	 System.out.println(count);
	 n-=1;
	}
	
	
}
}