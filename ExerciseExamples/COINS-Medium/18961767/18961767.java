import java.io.*;
import java.util.*;
import java.math.*;
 
class Solution {
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()){
       		System.out.println(coins(scn.nextLong()));
        }
   }
   static long coins(long n){
   	long sum=n/2+n/3+n/4;
   	if(sum>n)
   		return(coins(n/2)+coins(n/3)+coins(n/4));
       else
        return n;
   }
}