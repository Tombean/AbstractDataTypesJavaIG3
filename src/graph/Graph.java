package graph;

public interface Graph {
	
	/**
	 * Creates a new edge in this graph, going from the source vertex to the target vertex, and returns the created edge
	 * @param sourceVertex
	 * @param targetVertex
	 * @return an Edge associated to these vertices
	 */
	public Edge addEdge( Vertex sourceVertex, Vertex targetVertex );
	
	/**
	 * Adds the specified edge to this graph, going from the source vertex to the target vertex.
	 * @param sourceVertex
	 * @param targetVertex
	 * @param edge
	 * @return boolean indicating if the edge has successfully added to the graph calling the methods
	 */
	public boolean addEdgeToGraph( Vertex sourceVertex, Vertex targetVertex, Edge edge );
	
	/**
	 * Adds the specified vertex to this graph if not already present.
	 * @param vertex
	 * @return boolean indicating if the vertex has successfully added to the graph calling the methods
	 */
	public boolean addVertexToGraph( Vertex vertex );
	
	/**
	 * Returns true if this graph contains the specified edge.
	 * @param edge
	 * @return boolean
	 */
	public boolean containsEdge( Edge edge );
	
	/**
	 * Returns true if this graph contains the specified vertex.
	 * @param vertex
	 * @return boolean
	 */
	public boolean containsVertex ( Vertex vertex);
	
	/**
	 * Returns an array of the edges contained in this graph.
	 * @return an array of edges
	 */
	public Edge[] getAllEdges();
	
	/**
	 * Returns an array of the vertices contained in this graph.
	 * @return an array of vertex
	 */
	public Vertex[] getAllVertex();
	
	/**
	 * Returns an array of all edges touching the specified vertex.
	 * @param vertex
	 * @return an array of edges
	 */
	public Edge[] isInEdges( Vertex vertex );
	
	/**
	 * Returns an edge connecting source vertex to target vertex if such vertices and such edge exist in this graph.
	 * @param sourceVertex
	 * @param targetVertex
	 * @return Edge
	 */
	public Edge getEdge(Vertex sourceVertex, Vertex targetVertex);
	
	/**
	 * Indicates if an edge is directed or undirected
	 * @param edge
	 * @return true if directed, false if not
	 */
	public boolean isDirected( Edge edge);
	
	/**
	 * Removes the specified edge from the graph.
	 * @param edge
	 * @return true if the edge has been removed with no issue
	 */
	public boolean removeEdge( Edge edge );
	
	/**
	 * Removes the specified vertex from the graph.
	 * @param vertex
	 * @return true if the vertex has been removed with no issue
	 */
	public boolean removeVertex( Vertex vertex );
	
	/**
	 * Removes all the vertices in this graph that are also contained in the specified vertex array.
	 * @param vertices :  array of Vertex
	 * @return true if all vertices have been removed with no issue
	 */
	public boolean removeAllVertices( Vertex[] vertices );
	
	/**
	 * Removes all the edges in this graph that are also contained in the specified edges array.
	 * @param vertices :  array of Edge
	 * @return true if all edges have been removed with no issue
	 */
	public boolean removeAllEdges( Edge[] edges );
	
	/**
	 * Check if two edges are adjacent
	 * @param A
	 * @param B
	 * @return returns true if the two edges are adjacent
	 */
	public boolean isAdjacent( Edge A, Edge B);
}
