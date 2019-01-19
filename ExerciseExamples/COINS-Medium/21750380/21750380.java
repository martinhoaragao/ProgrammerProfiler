import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Coins{
	 public static long converted(long num){
        if(num<=11)
            return num;
        return converted(num/2)+converted(num/3)+converted(num/4);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        while(in.hasNext()){
            int num=in.nextInt();
            System.out.println(converted(num));
        }
    }
}