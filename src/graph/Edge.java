package graph;

public abstract class Edge {
	protected Vertex[] vertex;
	
	/**
	 * Returns the vertex formed by 2 coordinates of an edge
	 * @return a vertex
	 */
	public Vertex[] getEnds(){
		return this.vertex;
	}
	
	/**
	 * Checks if the vertex can be created
	 * @param v: array of Vertex
	 */
	public void setEnds( Vertex[] v){
		if (v.length ==  2 ){
			this.vertex = v;
		}
	}
}
