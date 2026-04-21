class UndtdGraph2{
	private int Vcnt,Ecnt;
	private boolean digraph;
	private class Node{
		int v;
		Node next;
		Node(int x,Node t){
			v=x;
			next=t;
		}
	}
	private Node[] adj;
	UndtdGraph2(int v,boolean flag){
		Vcnt=v;
		Ecnt=0;
		digraph=flag;
		adj=new Node[v];
	}
	int v(){
		return Vcnt;
	}
	int E(){
		return Ecnt;
	}
	boolean directed(){
		return digraph;
	}
	public void insert(int v,int w){
		adj[v]=new Node(w,adj[v]);
		if(!digraph){
			adj[w]=new Node(v,adj[w]);
		}
		Ecnt++;
	}
	public AdjList getAdjList(int v){
		return new AdjLinkedList(v);
	}
	private class AdjLinkedList implements AdjList{
		private int v;
		private Node t;
		AdjLinkedList(int v){
			this.v=v;
			t=null;
		}
		public int beg(){
			t=adj[v];
			return t==null ?-1:t.v;
		}
		public int nxt(){
			if(t!=null) t=t.next;
			return t==null ?-1:t.v;
		}
		public boolean end(){
			return t==null;
		}
	}
	interface AdjList{
		int beg();
		int nxt();
		boolean end();
	}
}
class GraphPath{
		public UndtdGraph2 g;
		private boolean found;
		private boolean[] visited;
		private boolean search(int v,int w){
			if(v==w){
				return true;
			}
			visited[v]=true;
			UndtdGraph2.AdjList a=g.getAdjList(v);
			for(int i=a.beg();!a.end();i=a.nxt()){
				if(!visited[i]){
					if(search(i,w)) return true;
				}
			}
			return false;
		}
		GraphPath(UndtdGraph2 g,int v,int w){
			this.g=g;
			found=false;
			visited=new boolean[g.v()];
			found=search(v,w);
		}
		boolean exists(){
			return found;
		}
}
