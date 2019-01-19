import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class SongInfo
{
	int n;
	char t;
	public SongInfo(int a, char b) {
		n=a;
		t=b;
	}
	SongInfo setLabel(char a)
	{
		this.t=a;
		return this;
	}
	
	char getLabel()
	{
		return this.t;
	}
}
class JOHNY implements Comparator<SongInfo>{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int size=in.nextInt();
			int pos=-1;
			ArrayList<SongInfo> arr=new ArrayList<>();
			for(int j=0;j<size;j++)
			{
				arr.add(new SongInfo(in.nextInt(),'a'));
			}
			int k=in.nextInt();
			k--;
			arr.set(k, arr.get(k).setLabel('b'));
			
			arr.sort(new JOHNY());
			
			for(int l=0;l<arr.size();l++)
			{
				if(arr.get(l).getLabel()=='b')
					{
						pos=l+1;
						break;
					}
				
			}
			System.out.println(pos);
		}

		
	}

	@Override
	public int compare(SongInfo o1, SongInfo o2) {
		// TODO Auto-generated method stub
		return o1.n-o2.n;
	}
}
