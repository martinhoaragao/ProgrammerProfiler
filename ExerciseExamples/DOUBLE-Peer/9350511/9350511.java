import java.util.Scanner;
class test{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        while(test>0){
            int n=in.nextInt();
            if(n%2!=0)
                n-=1;
            System.out.println(n);
            test--;
        }
    }
}