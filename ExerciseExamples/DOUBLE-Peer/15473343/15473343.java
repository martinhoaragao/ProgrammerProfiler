import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class Main{

    static Scanner sc = new Scanner(System.in);
    static int i(){return sc.nextInt();}   
    static String s(){return sc.next();}   
    public static void main(String args[]){
      int t = i();
      while(t-->0){
        int n = i();
        if(n%2==1){
          System.out.println(n-1);
        }else
       System.out.println(n);
      }
    }
      
}