import java.util.Scanner;
public class Main{
 public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    byte T=input.nextByte();
    while(T!=0){
        int count=0;
        String s=input.next();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='A' || c=='D'|| c=='O'||c=='P'||c=='Q'||c=='R')
                count++;
            if(c=='B')
                count=count+2;
        }
        System.out.println(count);
        T--;
    }
 }   
}