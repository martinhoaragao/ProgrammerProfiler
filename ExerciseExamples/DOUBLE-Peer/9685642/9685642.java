import java.util.Scanner;
class DoubleStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int N=sc.nextInt(); // length of palindrome
           if(N%2==0){
               System.out.println(N);
           }else{
               System.out.println(N-1);
           }
            T--;
        }
    }
}