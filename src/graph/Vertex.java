package graph;

public class Vertex {
	protected double[] coordinates;
	
	/**
	 * Creates a new vertex
	 * @param values
	 */
	public Vertex( double[] values ){
		if (values.length > 0){
			coordinates =  new double[values.length];
			this.coordinates = values;
			System.out.println("New vertex created ! ");
		}
		else {
			System.out.println("Error in vertex's creation ! Vertex has been initialized but will be unusuable. Please enter an array of coordinates to initialize your vertex. ");
		}
		
	}
	
	/**
	 * Returns an array of coordinates of a vertex
	 * @return an array of coordinates
	 */
	public double[] getCoordinates(){
		return this.coordinates;
	}
	
	/**
	 * Modifies a vertex, by changing the coordinates
	 * @param values, coordinates of a vertex to set
	 */
	public void setCoordinates( double[] values ){
		if (values.length == coordinates.length ){
			this.coordinates = values;
			System.out.println("Vertex edited ! ");
		}
		else {
			System.out.println("Error in vertex's edtion ! Vertex hasn't been changed. Please enter an array of coordinates with the same number of coordinates as the vertex you want to edit. ");
		}
	}
	
	/**
	 * Compares an array of Vertex to see if they are equal
	 * @param list is the array of vertexes to compare
	 * @return a boolean : true means that the vertexes are the same, false means at least one of the vertexes is not equal to the others.
	 */
	public boolean isTheSamePoint( Vertex[] list ){
		if ( list.length > 1 ){
			for (int i =  1; i< list.length; i++){
				if(list[i-1].getCoordinates() != list[i].getCoordinates() ) { return false; }
			}
		return true;
		}
		else {
			System.out.println("Error need at least 2 vertex to compare them ! ");
			return false;
		}
	}

}
