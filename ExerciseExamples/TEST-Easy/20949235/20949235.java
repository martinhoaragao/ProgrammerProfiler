 import java.util.Scanner;
 class Program{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 while(true){
 int num=sc.nextInt();
 if(num==42)
 break;
 else
 System.out.println(num);
 }
 }
 }