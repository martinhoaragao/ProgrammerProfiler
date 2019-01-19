import java.util.*;
class AW {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,n,s1,s2;
		t=sc.nextInt();
		while(t-->0)
			{
			s1=s2=0;
			n=sc.nextInt();
			while(n-->0)
				{
				s1+=sc.nextInt();
				s2+=sc.nextInt();
				}
			System.out.println(s1-s2);
			}
		
		}
	} 