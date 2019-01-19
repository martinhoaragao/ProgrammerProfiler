import java.util.Scanner;

class test{

public static void main(String arg[]){

int x;
//System.out.println("Hi World!");
Scanner in = new Scanner(System.in);
     for(int i=0;i<1000;i++){
      x = in.nextInt();
      if(x==42)
      break;
      System.out.println(x);
      }
}
}