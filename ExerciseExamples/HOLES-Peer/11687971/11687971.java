import java.util.*;
class test{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int tCase=sc.nextInt();
	String temp=sc.nextLine();
	while(tCase--!=0){
	     String s=sc.nextLine();
	     int count=0;
	     for(int i=0;i<s.length();i++){
	     char c=s.charAt(i);
	     if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
	     	count++;
	     if(c=='B')
	     	count+=2;
	     }
	     System.out.println(count);
	  }
	}
}