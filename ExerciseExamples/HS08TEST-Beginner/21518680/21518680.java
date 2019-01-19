import java.io.*;
import java.util.*;
class HS08TEST{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
  double bal = sc.nextDouble();
    if(num%5!=0){
      System.out.println(bal);
    }
    else{
      if(bal<num+0.50){
        System.out.println(bal);
      }
      else{
      bal-=num;
      bal-=0.50;
      System.out.println(bal);
  }}
    }

}
