import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class SegmentTree {
    int[] st_array ;
    SegmentTree(int[] dp,int n){
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st_array = new int[max_size];
        constructSTUtil(dp,0,n-1,0);
    }
    int getMid(int s, int e) {
        return s + (e - s) / 2;
    }
    int constructSTUtil(int arr[], int ss, int se, int si)
    {
        if (ss == se) {
            st_array[si] = arr[ss];
            return arr[ss];
        }
        int mid = getMid(ss, se);
        st_array[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) +
                 constructSTUtil(arr, mid + 1, se, si * 2 + 2);
        return st_array[si];
    }
    int func(int value,int qs,int qe,int n){
        int mid = getMid(qs,qe);
        int left = getSum(n,qs,mid);
        if(left>value)
            return func(value,qs,mid,n);
        else if(left<value)
            return func(value-left,mid+1,qe,n);
        else return funcc(value,qs,qe,n);
    }
    int funcc(int value,int qs,int qe,int n){
        if(qs==qe)
            return qe;
        int mid = getMid(qs,qe);
        int left = getSum(n,qs,mid);
        if(left==value)
        return funcc(value,qs,mid,n);
        return funcc(value-left,mid+1,qe,n);
    }
    int getSum(int n, int qs, int qe)
    {
        if (qs < 0 || qe > n - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, n - 1, qs, qe, 0);
    }
    int getSumUtil(int ss, int se, int qs, int qe, int si)
    {
        if (qs <= ss && qe >= se)
            return st_array[si];
        if (se < qs || ss > qe)
            return 0;
        int mid = getMid(ss, se);
        return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
                getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
    }
    void updateValueUtil(int ss, int se, int i, int diff, int si)
    {
        // Base Case: If the input index lies outside the range of 
        // this segment
        if (i < ss || i > se)
            return;
 
        // If the input index is in range of this node, then update the
        // value of the node and its children
        st_array[si] = st_array[si] + diff;
        if (se != ss) {
            int mid = getMid(ss, se);
            updateValueUtil(ss, mid, i, diff, 2 * si + 1);
            updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
        }
    }
 
    // The function to update a value in input array and segment tree.
   // It uses updateValueUtil() to update the value in segment tree
    void updateValue(int arr[], int n, int i, int new_val)
    {
        // Check for erroneous input index
        if (i < 0 || i > n - 1) {
            System.out.println("Invalid Input");
            return;
        }
 
        // Get the difference between new value and old value
        int diff = new_val - arr[i];
 
        // Update the value in array
        arr[i] = new_val;
 
        // Update the values of nodes in segment tree
        updateValueUtil(0, n - 1, i, diff, 0);
    }
}
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 for(int k=0;k<t;k++){
	     int n = s.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i<n;i++)
	        arr[i] = s.nextInt();
	     int[] dp = new int[n];
	     int[] res = new int[n];
	     Arrays.fill(res,-1);
	     Arrays.fill(dp,1);
	     SegmentTree st = new SegmentTree(dp,n);
	     for(int i=n-1;i>=0;i--){
	         //int temp = arr[i];
	         res[i] = st.func(i-arr[i]+1,0,n-1,n)+1;
	         st.updateValue(dp, n, res[i]-1, 0);
	     }
	     for(int i=0;i<n;i++)
	        System.out.print(res[i]+" ");
	     System.out.println();
	 }
	 }
}