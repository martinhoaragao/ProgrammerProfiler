import java.io.*;
import java.util.*;
import java.math.*;
 
class Solution {
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLong()){
       		System.out.println(coins(scn.nextLong()));
        }
   }
   static long coins(long n){
   	if(n>11)
   		return(coins(n/2)+coins(n/3)+coins(n/4));
       else
        return n;
   }
} 