import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt(), evens = 0, odds = 0;
        double evensSum = 0;
        /*I'm assuming the input is viable, i.e. all input numbers are positive integers*/
        while(value != 0){
            if((value & 1) == 0){
                evens++;
                evensSum += value;
            } else odds++;
            value = in.nextInt();
        }
        System.out.println(evens);
        System.out.println(odds);
        System.out.println(evens >0?evensSum/evens:evensSum);
    }
}