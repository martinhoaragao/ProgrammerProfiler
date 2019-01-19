import java.util.*;
import java.lang.Math;

class atm{
	public static void main(String []args){
		int x;
		float y;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextFloat();
		
		if(((float)x+0.50)>y){
			System.out.println(Math.round(y*100.0)/100.0);
		}else{
			if(x%5==0){
				System.out.println(Math.round((y-(float)x-0.50)*100.0)/100.0);   
			}else{
				System.out.println(Math.round(y*100.0)/100.0);
			}
		}
	}

}