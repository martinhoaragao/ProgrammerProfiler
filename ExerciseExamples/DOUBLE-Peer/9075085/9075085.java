import java.util.Scanner;
class easiest {
public static void main(String[] args){
	int t,n;
	Scanner input=new Scanner(System.in);
	t=input.nextInt();
	while(t-->0)
	{
		n=input.nextInt();
		if(n%2==0){System.out.println(n);}
		else{System.out.println(n-1);}
	}
}
}
