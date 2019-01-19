


import java.util.*;
public class Main{
    public static void main(String[] args) {
        String text;
        short t;
        Scanner s=new Scanner(System.in);
        t=s.nextShort();
        while(t!=0){
            int holes=0;
            text=s.next();
            int i=0;
            int n=text.length();
            for(;i<n;i++){
                if(text.charAt(i)=='B'){
                    holes+=2;
                }
                if(text.charAt(i)=='A'||text.charAt(i)=='D'||text.charAt(i)=='O'||text.charAt(i)=='P'||text.charAt(i)=='Q'||text.charAt(i)=='R'){
                    holes+=1;
                }
            }
            System.out.println(holes);
            t-=1;
        }
    }
}
