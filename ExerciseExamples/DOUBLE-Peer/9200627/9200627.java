import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        int testCases = Integer.parseInt(scan.nextLine());
        long doubleStringMaxLength=0;
        long palindromeLength;

        for(int t = 0 ; t < testCases; t++){
            palindromeLength = Long.parseLong(scan.nextLine());
            if(palindromeLength % 2 == 0 ){
                doubleStringMaxLength = palindromeLength;
            }
            else if(palindromeLength % 2 == 1 || palindromeLength == 1){
                doubleStringMaxLength = palindromeLength - 1;
            }

            System.out.println(doubleStringMaxLength);
        }

    }
}
