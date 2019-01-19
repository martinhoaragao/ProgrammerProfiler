import java.util.Scanner;
class TREEROOT{
public static void main(String[] arg){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    for(int i=0;i<n;i++){
	int m=sc.nextInt();
	int arr[][]=new int[m][2];
           int s1=0,s2=0;
	for(int j=0;j<m;j++){
		arr[j][0]=sc.nextInt();
		arr[j][1]=sc.nextInt();
		s1+=arr[j][0];
		s2+=arr[j][1];

}
    System.out.println(s1-s2);
}
sc.close(); }
}    

