import java.util.Scanner;
class Any
{
	public static void main(String args[]){
	    int sum,t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	   while(t-->0)
	   {
	    sum=0;
	    String s=sc.next();
	    for(int i=0;i<s.length();i++)
	    {
	      char c=s.charAt(i);
	      if(c=='A'|| c=='D' || c=='O'|| c=='P'|| c=='Q'|| c=='R')
	      {
	        sum++;
	       }
	       else if(c == 'B')
	       {
	         sum = sum + 2;
	       }
	      } 
	        System.out.println(sum);
	        }
	     }

}