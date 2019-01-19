
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Integer> outputList= new ArrayList<>();

        int testCase=scan.nextInt();
        for (int i=0;i<testCase;i++) {
          int noOfNode=scan.nextInt();
            Integer myOutput=0;
          while(noOfNode-->0) {
              int input1 = scan.nextInt();
              int input2 = scan.nextInt();
              myOutput=myOutput+(input1-input2);
             // --noOfNode;
          }
            outputList.add(myOutput);
        }
        for (Integer myInt:outputList) {
            System.out.println(myInt);
        }
    }
}
