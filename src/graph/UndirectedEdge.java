package graph;

public class UndirectedEdge extends Edge {
	public UndirectedEdge(Vertex sourceVertex, Vertex targetVertex ){
		this.vertex = new Vertex[2];
		this.vertex[0] = sourceVertex;
		this.vertex[1] = targetVertex;
	}
}

