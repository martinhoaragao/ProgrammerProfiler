import java.util.Scanner;

public class Novais{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        try{
            double sum = 0;
            int m = Integer.parseInt(input[0]), n = Integer.parseInt(input[1]);
            double[] values = new double[n];
            for (int i = 2; i < input.length; i++)
                values[i - 2] = Double.parseDouble(input[i]);

            for(double v : values){
                sum += v;
                if (v > m)
                    System.out.println((int)v);
            }
            System.out.println(sum/n);
        } catch(NumberFormatException|ArrayIndexOutOfBoundsException e){
            System.err.println("Error. Exiting");
            System.exit(-1);
        }
    }
}