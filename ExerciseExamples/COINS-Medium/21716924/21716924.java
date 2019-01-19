import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef{
    public long maxexchange(long number){
        if(number < 12)
            return number;
        return Math.max(number,maxexchange(number/2) + maxexchange(number/3) + maxexchange(number/4));
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CodeChef obj = new CodeChef();
        while(sc.hasNext()){
            long n = sc.nextLong();
            System.out.println(obj.maxexchange(n));
        }
    }
}
