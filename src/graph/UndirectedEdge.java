package graph;

public class UndirectedEdge implements Edge {
	Vertex[] vertex;
	public UndirectedEdge(Vertex[] vertexInit){
		this.vertex = new Vertex()[2];
		if (vertexInit.length() ==  2 ){
			this.vertex = vertexInit;
		}
		else{ System.out.println("An edge needs 2 vertex, the amount of vertex given for this edge is wrong, the edge hasn't been initialized. ");}
	}
}

