import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);
        String userinput = null;

//        if (null != args && args.length > 0)  {
//            System.out.println(args[0]);
            do {
                if (userinput != null) {
                    System.out.println(userinput);
                }

                //  prompt for the user's name
                //  System.out.print("Enter your name: ");

                // get their input as a String
                userinput = scanner.next();
            } while (!userinput.equals("42"));
//        }
//        else {
//            System.out.println("I got nothin");
//        }
    }
}
