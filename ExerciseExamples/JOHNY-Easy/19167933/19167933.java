import java.util.*;

class JONNY {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] playList = new int[n];
            for(int j=0;j<n;j++){
                int val = scan.nextInt();
                playList[j]=val;
            }
            int K = scan.nextInt();
            int jonny = playList[K-1];
            Arrays.sort(playList);
            for(int j=0;j<n;j++){
                if(playList[j]==jonny){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
