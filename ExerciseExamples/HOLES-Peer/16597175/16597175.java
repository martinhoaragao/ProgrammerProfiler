import java.util.Scanner;

  class Holes_in_the_text {
    public static void main(String[] args)  {  
    Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();      
        while(T-->0){               
       String s=sc.next();
       int count=0;       
   for(int i=0;i<s.length();i++) {
   if(s.charAt(i)=='A' || s.charAt(i)=='D' || s.charAt(i)=='O' || s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R') count++;
   else if(s.charAt(i)=='B') count+=2;
    }        
  System.out.println(count);
       
       }
       
        }
    }
    