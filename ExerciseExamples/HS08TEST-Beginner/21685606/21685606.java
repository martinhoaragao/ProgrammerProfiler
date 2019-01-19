//@author 
import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float w=scan.nextFloat();
        float a=scan.nextFloat();
        if((w+.5)<=a&&w%5==0){
        
        System.out.println(a-w-.5);
        }
        else
        System.out.println(a);
    }
}