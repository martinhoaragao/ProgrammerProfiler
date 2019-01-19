import java.util.Scanner;
class Sol {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        int i = sc.nextInt();
           if(i!=42) {
               System.out.println(i);
           }
           else
           break;
        }
    }
}
