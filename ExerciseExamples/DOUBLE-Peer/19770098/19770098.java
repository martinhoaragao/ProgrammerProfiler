import java.util.Scanner;

/**
 * https://www.codechef.com/problems/DOUBLE
 */
class DOUBLE {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        int t=sc.nextInt();


        while(t-- >0){
            int n=sc.nextInt();
            if((n & 1)==0){
                System.out.println(n);
            }else{
                System.out.println(n-1);
            }
        }
    }
}