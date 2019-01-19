import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Win 10
 * Date: 6/9/18
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t;i++){
            int n=sc.nextInt();
            List<Integer> inputList=new ArrayList<Integer>();
            for(int j=0; j<n;j++){
                inputList.add(sc.nextInt());
            }
            int JonyLength=inputList.get(sc.nextInt()-1);
            Collections.sort(inputList);
            for(int k=0;k<inputList.size();k++){
                if(JonyLength==inputList.get(k)){
                    System.out.println(k+1);
                    break;
                }
            }


        }
    }
}
