import java.util.Scanner;

 class Atm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float intial=sc.nextFloat();
        if(x%5==0&&x+(0.5)<=intial)
        {
            intial= (float) (intial-x-0.5);

        }
        System.out.printf("%.2f", intial);

    }
}
