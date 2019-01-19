import java.util.*;
class Main {
  public static void main(String[] args) {
  	int t;
  	int n;
  	Scanner sc= new Scanner(System.in);
  	t=sc.nextInt();
  	while(t!=0){
  		t--;
  		n=sc.nextInt();
  		int ac=0;
  		int cu=0;
  		while(n!=0){
  			n--;
  			ac=ac+sc.nextInt();
  			cu=cu+sc.nextInt();
  			
  			
  		}
  		System.out.println(ac-cu);
  		
  		
  		
  		
  	}
    //System.out.println("hello world");
  }
}