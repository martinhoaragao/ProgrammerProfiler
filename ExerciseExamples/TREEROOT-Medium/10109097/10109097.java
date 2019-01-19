import java.util.Scanner;
class RootProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t -- > 0) {
            int n = sc.nextInt();sc.nextLine();
            int[] parent = new int[n]; 
//            int[] childs = new int[n];
            int childCount = 0;
            int index = 0;
            while(n -- > 0) {
                parent[index] = sc.nextInt(); 
                childCount  += sc.nextInt();
                sc.nextLine();
                index++;
            }
            int parentCount = 0;int finl = 0;
            for (int i = 0; i < parent.length; i ++) {
                parentCount = 0;
                for (int j = 0; j < parent.length; j ++) {
                    if (i != j){
                        parentCount += parent[j];
                    }
                }
                if (parentCount == childCount) {
                    finl = parent[i];
                }
            }
            System.out.println(finl);
        }
    }
    
}