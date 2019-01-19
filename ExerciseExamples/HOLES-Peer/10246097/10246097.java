import java.util.Scanner;
 
class hole {
	  public static void main(String[] arg) {
		  
     Scanner input =new Scanner(System.in);
	 
	 int t=input.nextInt();
	 for(int i=0;i<t;i++)
	 {
	     int sum=0;
	     
	     char []ch=input.next().toCharArray();
	     for(int j=0;j<ch.length;j++)
	     {
	         if(ch[j]=='A'||ch[j]=='D'||ch[j]=='O'||ch[j]=='P'||ch[j]=='Q'||ch[j]=='R')
	         sum++;
	         else if(ch[j]=='B')
	         sum+=2;
	     }
	     System.out.println(sum);
	 }
	 input.close();
}
} 