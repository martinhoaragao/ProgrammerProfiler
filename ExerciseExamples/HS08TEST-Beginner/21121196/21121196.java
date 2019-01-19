import java.util.*;
class Program{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        double t = scn.nextDouble();
        if(w % 5 == 0 && t - (w+0.50) > 0)
            t -= (w+0.50);
        System.out.printf("%.2f",t);
    }
} 