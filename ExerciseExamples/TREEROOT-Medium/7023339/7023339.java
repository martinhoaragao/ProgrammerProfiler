import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner conin = new Scanner(System.in);
    int t=conin.nextInt();
    for(int a=0; a<t; a++) {
    	int n=conin.nextInt();
    	int idsum=0, idchildsum=0;
    	for(int i=0; i<n; i++){
    		idsum=idsum+conin.nextInt();
    		idchildsum=idchildsum+conin.nextInt();
    	}
    	int root=idsum-idchildsum;
    	System.out.println(root);
    }
    conin.close();
    System.exit(0);
  }
}