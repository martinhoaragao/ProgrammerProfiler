import java.util.Scanner;
class Atm{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    double y=sc.nextDouble();
    if(((x+0.50)<y) && (x%5==0)){
       y=y-(x+0.50);
        }
    System.out.println((double)y);
    sc.close();
    
}
}