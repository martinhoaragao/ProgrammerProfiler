import java.util.*;
class doubl{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        
        while(t-->0){
            long a = s.nextLong();
            if(a%2!=0)
                a--;
            System.out.println(a);
        }
    }
}