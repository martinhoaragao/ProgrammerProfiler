import java.io.*;
import java.lang.*;
import java.util.*;
class balance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float w=sc.nextFloat();
float b=sc.nextFloat();
if(w%5==0 && w<=b-0.5)
System.out.printf("%.2f",b-w-0.5);
else
System.out.printf("%.2f",b);
}
}