import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while (true)
        {
            int num=scanner.nextInt();
            if(num!=42)
               sb.append(num).append("\n");
            else
                break;
            scanner.nextLine();
        }

        System.out.println(sb.toString());
    }
}