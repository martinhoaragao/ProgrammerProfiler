import java.util.Scanner;

class FirstProblem{
  public static void main(String[] args){
  	int a;
  	Scanner sc=new Scanner(System.in);
  	while(true){
  		a=sc.nextInt();
  		if(a!=42)System.out.println(""+a);
  		else break;
  	}
     }
  }