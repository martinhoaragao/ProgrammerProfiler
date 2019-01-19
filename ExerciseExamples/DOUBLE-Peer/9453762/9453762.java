import java.util.Scanner;

 class DoubleString {
static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     
     int t=scn.nextInt();
     for(int i=0;i<t;i++){
    	  sum=scn.nextInt();
    	  if(sum%2==0) System.out.println(sum);
    	  else System.out.println(sum-1);
     }
    
	}

}
