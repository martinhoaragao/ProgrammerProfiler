import java.util.*;
class johny{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l;
		while(n>0){
			l=s.nextInt();
			int a[]=new int[l];
			for(int i=0;i<l;i++){
				a[i]=s.nextInt();
			}
			int pos=s.nextInt();
			int johny=a[pos-1];
			//System.out.println(johny);
			int slist[]=sort(a);
			
			for(int i=0;i<l;i++){
				if(slist[i]==johny){
					System.out.println(i+1);
					break;
				}
			}
			n--;
		}
	}
	static int[] sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		/*for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
				System.out.print(" ");
			}*/
		return a;
	}
}