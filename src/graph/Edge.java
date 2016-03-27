package graph;

public abstract class Edge {
	protected Vertex[] vertex;
	
	public Vertex[] getEnds(){
		return this.vertex;
	}
	
	public void setEnds( Vertex[] v){
		if (v.length ==  2 ){
			this.vertex = v;
		}
	}
}
