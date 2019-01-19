import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  class Holes_in_the_text {
    public static void main(String[] args) throws IOException  {  
    //Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine());      
        while(T-->0){               
       String s=br.readLine();
       int count=0;       
   for(int i=0;i<s.length();i++) {
   if(s.charAt(i)=='A' || s.charAt(i)=='D' || s.charAt(i)=='O' || s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R') count++;
   else if(s.charAt(i)=='B') count+=2;
    }        
  System.out.println(count);
       
       }
       
        }
    }