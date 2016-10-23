import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int threshold = in.nextInt(), i, ages = i = in.nextInt(), age, sum = 0;
        while(i > 0){
            sum += age = in.nextInt();
            if(age > threshold)System.out.println(age);
            i--;
        }
        /*Double or float, according to the desired decimal digits precision*/
        System.out.println(ages > 0 ? (double) sum/ages : 0.0);
    }
}