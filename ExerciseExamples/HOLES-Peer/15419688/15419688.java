import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class Main
{
    static void isHole(String s,int n){
      int count = 0;
      for(int i=0;i<n;i++){
        if((s.charAt(i)== 'A') || (s.charAt(i) == 'D')|| (s.charAt(i)=='O')||
        (s.charAt(i)=='P')||(s.charAt(i)=='R')||(s.charAt(i)=='Q')){
          count++;
        }else if(s.charAt(i)=='B'){
          count+=2;
        }
        
      }
      System.out.println(count);
    }
    static Scanner sc = new Scanner(System.in);
    static int i(){return sc.nextInt();}   
    static String s(){return sc.next();} 
    public static void main(String args[]){
      int t = i();
      while(t-->0){
        
        String s = s().toUpperCase();
        //char ch[] = s().toUpperCase.toCharArray();
        
        isHole(s,s.length());
        //System.out.println();
      }
    }
}