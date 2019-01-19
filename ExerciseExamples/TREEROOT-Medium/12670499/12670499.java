import java.util.Scanner;
 
class TREEROOT {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int sumOfNodes=0, sumOfChildren=0;
 
            int numOfNodes=sc.nextInt();
 
            for(int i=1;i<=numOfNodes;i++) {
                int id=sc.nextInt();
                int idSum=sc.nextInt();
                sumOfNodes+=id;
                sumOfChildren+=idSum;
            }
            System.out.println(sumOfNodes-sumOfChildren);
            testCases--;
        }
    }
} 