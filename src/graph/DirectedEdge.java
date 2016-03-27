package graph;

public class DirectedEdge extends Edge {
	// In this class, vertex[0] will be considered as the origin of the directed edge and vertex[1] as the end of the vertex.
	public DirectedEdge(Vertex[] vertexInit){
		this.vertex = new Vertex[2];
		if (vertexInit.length ==  2 ){
			this.vertex = vertexInit;
		}
		else{ System.out.println("An edge needs 2 vertexes, the amount of vertex given for this edge is wrong, the edge hasn't been initialized. ");}
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
