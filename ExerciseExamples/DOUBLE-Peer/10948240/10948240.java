import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int t,n,x,div;
    Scanner sc=new Scanner(System.in);
    t=Integer.parseInt(sc.nextLine());
    while(t!=0){
      t--;
      n=sc.nextInt();
      if((n&1)==1)
        n--;
      System.out.println(n);
    }
  }
}
