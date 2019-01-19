import java.lang.*;
import java.util.*;

class Main{
	
	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
	int withdrawAmount=sc.nextInt();
	double total=sc.nextDouble();
	double ans;
	if(withdrawAmount%5==0)
	{
		if(withdrawAmount<=(total-0.5))ans=(total-withdrawAmount-0.5);
		else ans=total;
		
	}else
		ans=total;
	System.out.printf("%4.2f",ans);	
	
	
		
		
	
	
	

	}
}
