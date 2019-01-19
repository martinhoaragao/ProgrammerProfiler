import java.util.*;

class Main {
    public static void main(String[] arg) {
    	int x;
        double y;
        Scanner kb = new Scanner(System.in);
        x = kb.nextInt();
        y = kb.nextDouble();
        if(x%5==0) {
        	if(x<=(y-0.5)) {
        		System.out.printf("%.2f",(y-x)-0.5);
        	}else {
        		System.out.printf("%.2f",y);
        	}
        }else {
        	System.out.printf("%.2f",y);
        }
    }
}