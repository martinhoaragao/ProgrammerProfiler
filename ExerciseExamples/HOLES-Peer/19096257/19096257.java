import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int hole[]=new int[t];
		for (int x=0;x<t;x++){
			String str=s.next();
			int len=str.length();
			for(int i=0;i<len;i++){
				char ch=str.charAt(i);
				if (ch=='B'){
					hole[x]+=2;
				}
				else if (ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'){
					hole[x] ++;
				}
			}
		}	
		for (int j=0;j<t;j++){
			System.out.println(hole[j]);
		}
	}
}