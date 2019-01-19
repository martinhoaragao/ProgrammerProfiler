import java.util.*;
public class Main {   
    static  long valueforcoins(long n)
{
		
if((n/2)+(n/3)+(n/4)>n)	
return valueforcoins(n/2)+valueforcoins(n/3)+valueforcoins(n/4);	

else
	return n;

}
	


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext())
	{	
	long n=sc.nextInt();
	System.out.println(Main.valueforcoins(n));
}
}
}