import java.util.Scanner;
public class Main{
 public static void main(String [] args){
 double X,Y;
 Scanner in = new Scanner(System.in);
 X =in.nextDouble();
 Y = in.nextDouble();
  if(X>0 && X<=2000 && Y>=0 && Y<=2000){
  if(X%5==0 && Y>=(X+0.50)){
  	System.out.println(Y-(X+0.50)+"0");
  }
  else System.out.println(Y+"0");
  }
  }

}
