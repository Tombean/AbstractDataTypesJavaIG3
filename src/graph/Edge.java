package graph;

public abstract class Edge {
	Vertex[] vertex;
	
	public Vertex[] getEnds(){
		return this.vertex;
	}
	
	public void setEnds( Vertex[] v){
		if (v.length ==  2 ){
			this.vertex = v;
		}
	}
}
