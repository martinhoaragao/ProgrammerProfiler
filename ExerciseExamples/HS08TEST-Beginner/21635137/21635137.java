import java.util.*;
class Main {
  public static void main(String[] args) {
    int x;float y;
    Scanner in = new Scanner(System.in);
    x=in.nextInt();
    y=in.nextFloat();
    if (x%5!=0 || x>y-0.50){
        System.out.printf("%.2f",y);
    }
    else{
        float ans;
        ans=y-x-0.50f;
        System.out.printf("%.2f",ans);
    }

    }
  }