package graph;

public class DirectedEdge extends Edge {
	// In this class, vertex[0] will be considered as the origin of the directed edge and vertex[1] as the end of the vertex.
	public DirectedEdge(Vertex sourceVertex, Vertex targetVertex){
		this.vertex = new Vertex[2];
		this.vertex[0] = sourceVertex;
		this.vertex[1] = targetVertex;
	}
	
	public Vertex getOrigin(){
		return this.vertex[0];
	}
	
	public Vertex getEnd(){
		return this.vertex[0];
	}
	
	public void setOrigin( Vertex v){
		this.vertex[0] = v;
	}
	
	public void setEnd( Vertex v ){
		this.vertex[0] = v;
	}
}
