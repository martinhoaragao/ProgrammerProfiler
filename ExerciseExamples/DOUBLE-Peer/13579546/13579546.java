import java.util.*;

class code {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
       long n=in.nextLong();
       System.out.println((n-n%2));
       }
    }
}
