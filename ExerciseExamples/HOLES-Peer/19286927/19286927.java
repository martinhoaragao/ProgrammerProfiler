import java.util.*;
class Competitive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
           int g=0;
            String s = sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='B')
                {g=g+2;}
                if(s.charAt(i)=='A'||s.charAt(i)=='D'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R')
                { g=g+1; }
            }
            System.out.println(g);
        }
    }
}
