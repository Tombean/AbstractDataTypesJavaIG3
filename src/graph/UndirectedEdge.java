package graph;

public class UndirectedEdge extends Edge {
	/**
	 * Creates a new undirected edge, going from the source vertex to the target vertex 
	 * @param sourceVertex
	 * @param targetVertex
	 */
	public UndirectedEdge(Vertex sourceVertex, Vertex targetVertex ){
		this.vertex = new Vertex[2];
		this.vertex[0] = sourceVertex;
		this.vertex[1] = targetVertex;
	}
}

