import java.util.*;
import java.lang.*;
import java.io.*;
 class NewClass4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int COUNT=0,i;
        while(T-->0){
            String p = s.next();COUNT=0;
            for(i=0;i<p.length();i++){
                char aT = p.charAt(i);
                if(aT=='A'||aT=='D'||aT=='O'||aT=='P'||aT=='Q'||aT=='R'){
                    COUNT = COUNT+1;
                }else if(aT=='B'){
                    COUNT = COUNT+2;
                    
                }else{
                    continue;
                }
            }
            System.out.println(COUNT);
        }
        
        
        
    }
    
}
