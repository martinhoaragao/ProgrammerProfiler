import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String temp = sc.nextLine();
            int countSpaces = 0;
            for (int j = 0; j < temp.length(); j++) {
                int cc = temp.charAt(j);
                if (cc == 65||cc==68||cc==79||cc==80||cc==81||cc==82)
                    countSpaces++;
                else if (cc==66)
                    countSpaces+=2;
            }
            System.out.println(countSpaces);
        } 
    }
}