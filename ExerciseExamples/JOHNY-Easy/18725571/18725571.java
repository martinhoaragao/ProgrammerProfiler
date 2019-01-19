import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
 
class xyz
{
    public static void main(String[] args) {
    Scanner gopal = new Scanner(System.in);
    int t= gopal.nextInt();
    
    while(t>0){
    int len= gopal.nextInt();
    int[] arr = new int[len];
    
    for(int i=0;i<len;i++){
    arr[i] = gopal.nextInt();
    }
    int b= gopal.nextInt();
    int k= arr[b-1];
    
    Arrays.sort(arr);
    System.out.println(Arrays.binarySearch(arr, k)+1);
    
   
    
    
    
    
    
    
    t--;
    }
    }
    }
  