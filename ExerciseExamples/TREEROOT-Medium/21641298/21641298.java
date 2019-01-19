import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long t = scanner.nextLong();
        for(int i = 0; i < t; i++) {
            Long numberOfNodes = scanner.nextLong();
            Long sumOfIdsForAllNodes = 0L;
            Long sumOfChildrenNodesForAllNodes = 0L;
            while(numberOfNodes > 0) {
                Long id = scanner.nextLong();
                Long sumOfChildrenNodes = scanner.nextLong();
                sumOfIdsForAllNodes += id;
                sumOfChildrenNodesForAllNodes += sumOfChildrenNodes;
                numberOfNodes--;
            }
            System.out.println(sumOfIdsForAllNodes - sumOfChildrenNodesForAllNodes);
        }
    }
}
