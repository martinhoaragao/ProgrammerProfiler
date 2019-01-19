//package yr16.m7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by cscvenkatmadurai on 7/26/2016.
 * https://www.codechef.com/COOK29/problems/TREEROOT
 */
class TreeRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String ip[];
        int tt = Integer.parseInt(kb.readLine());
        int n,sumId,nodeId;
        while (tt-- > 0){
            n = Integer.parseInt(kb.readLine());
            sumId = nodeId = 0;
            while (n-- > 0){
                ip = kb.readLine().split(" ");
                nodeId += Integer.parseInt(ip[0]);
                sumId += Integer.parseInt(ip[1]);
            }
            System.out.println(nodeId-sumId);
        }
    }
}
