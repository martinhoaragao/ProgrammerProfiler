

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class TREEROOT {

	class Node implements Comparable<Node>{
		int id;
		int sum;
			
		public Node(int id, int sum) {
			super();
			this.id = id;
			this.sum = sum;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			
			if(sum<o.sum) {
				return -1;
			}
			if(sum>o.sum) {
				return 1;
			}			
			return 0;
		}
		
	}
	
	public static boolean remove2iD(ArrayList<Node>pq,int id1,int id2) {
		Node ns1=null;
		Node ns2=null;
		for(Node n:pq) {
			if(n.id==id1) {
				ns1=n;
			}
			if(n.id==id2) {
				ns2=n;
			}
		}
		if(ns1 ==null ||ns2==null) {
			return false;
		}
		for(Node n:pq) {
			if(n.sum==ns1.id+ns2.id) {
				pq.remove(ns1);
				pq.remove(ns2);
				n.sum=0;
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean removeiD(ArrayList<Node>pq,int id) {
		Node ns=null;
		for(Node n:pq) {
			if(n.id==id) {
				ns=n;
				break;
			}
		}
		if(ns==null) {
			return false;
		}
		for(Node n:pq) {
			if(n.sum==ns.id) {
				pq.remove(ns);
				n.sum=0;
				return true;
			}
		}
		
		return false;
	}
	public static int getRoot(ArrayList<Node> pq) {
		if(pq.size()==1) {
			return pq.get(0).id;
		}else {
			
			for(int i=0;i-2<pq.size()-1;i++) {
				for(int j=i+1;j<pq.size();j++) {
					if(pq.get(i).sum==0) {
						
						ArrayList<Node> clone = (ArrayList<Node>) pq.clone();
						boolean removed=removeiD(clone, pq.get(i).id);
						if(removed) {
							int root=getRoot(clone);
							if(root!=-1) {
								return root;
							}
						}
					}
					if(pq.get(j).sum==0) {
						ArrayList<Node> clone = (ArrayList<Node>) pq.clone();
						boolean removed=removeiD(clone, pq.get(j).id);
						if(removed) {
							int root=getRoot(clone);
							if(root!=-1) {
								return root;
							}
						}
					}
					if(pq.get(i).sum==0 && pq.get(j).sum==0) {
						ArrayList<Node> clone = (ArrayList<Node>) pq.clone();
						boolean removed=remove2iD(clone, pq.get(i).id,pq.get(j).id);
						if(removed) {
							int root=getRoot(clone);
							if(root!=-1) {
								return root;
							}
						}
					}
				}	
			}
			return -1;
		}
				
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int nnodes=sc.nextInt();
			PriorityQueue<Node>pq=new PriorityQueue<Node>();
			int root=0;
			while(nnodes-->0) {
				int id=sc.nextInt();
				int childSum=sc.nextInt();
				Node n=new TREEROOT().new Node(id,childSum);
				pq.add(n);
				root+=id-childSum;
			}
			ArrayList<Node> a=new ArrayList(pq);
			System.out.println(root);
		}

	}

}
