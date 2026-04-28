import java.util.*;
class GraphAM{
	private int Vcnt,Ecnt;
	private boolean digraph;
	private boolean[][] adj;
	GraphAM(int v,boolean flag){
		Vcnt=v;
		Ecnt=0;
		digraph=flag;
		adj=new boolean[v][v];
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
		if(adj[v][w]==false){
			Ecnt++;
			adj[v][w]=true;
		}
		if(!digraph){
			adj[w][v]=true;
		}
	}
	boolean edge(int v,int w){
		return adj[v][w];
	}
	public AdjList getAdjList(int v){
		return new AdjArray(v);
	}
	private class AdjArray implements AdjList{
		int i,v;
		AdjArray(int v){
			this.v=v;
			i=-1;
		}
		public int beg(){
			i=-1;
			return nxt();
		}
		public int nxt(){
			for(i++;i<v();i++){
				if(edge(v,i)==true) return i;
			}
			return -1;
		}
		public boolean end(){
			return i>=v();
		}
	}
	interface AdjList{
		int beg();
		int nxt();
		boolean end();
	}
	public void show(GraphAM g){
		for(int i=0;i<g.v();i++){
			System.out.print(i+":  ");
			AdjList a=g.getAdjList(i);
			for(int j=a.beg();!a.end();j=a.nxt()){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void randE(GraphAM g,int e){
		for(int i=0;i<e;i++){
			int v=(int)(g.v()*Math.random());
			int w=(int)(g.v()*Math.random());
			g.insert(v,w);
		}
	}

}
class GraphPathAM{
	private GraphAM g;
	private boolean[] visited;
	private boolean found;
	private boolean search(int v,int w){
		if(v==w) return true;
		visited[v]=true;
		GraphAM.AdjList a=g.getAdjList(v);
		for(int i=a.beg();!a.end();i=a.nxt()){
			if(!visited[i]){
				if(search(i,w)) return true;
			}
		}
		return false;
	}
	GraphPathAM(GraphAM g,int v,int w){
		this.g=g;
		found=false;
		visited=new boolean[g.v()];
		found=search(v,w);
	}
	boolean exists(){
		return found;
	}
}
