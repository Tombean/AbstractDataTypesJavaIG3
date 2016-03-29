package graph;

public class DirectedEdge extends Edge {
	// In this class, vertex[0] will be considered as the origin of the directed edge and vertex[1] as the end of the vertex.
	/**
	 * Creates a new directed edge, going from the source vertex to the target vertex 
	 * @param sourceVertex
	 * @param targetVertex
	 */
	public DirectedEdge(Vertex sourceVertex, Vertex targetVertex){
		this.vertex = new Vertex[2];
		this.vertex[0] = sourceVertex;
		this.vertex[1] = targetVertex;
		System.out.println("DirectedVertex created");
	}
	
	/**Returns the source of a vertex, which is the first element of the array
	 * @ return an origin
	 */
	public Vertex getOrigin(){
		return this.vertex[0];
	}
	
	/**Returns the target of a vertex, which is the second element of the array
	 * @ return the target point
	 */
	public Vertex getEnd(){
		return this.vertex[0];
	}
	
	/**
	 * @param v, vertex's origin to set
	 */
	public void setOrigin( Vertex v){
		this.vertex[0] = v;
	}
	
		/**
	 * @param v, vertex's end to set
	 */
	public void setEnd( Vertex v ){
		this.vertex[0] = v;
	}
}
