import java.util.*;
public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int temp=0;
    while (sc.hasNext()){
      int n = sc.nextInt();
      if (n==42)
        temp=1;
      else if(temp==0)
        System.out.println(n);   
    }
  }
}