package graph;

public class TestGraph  {

	public static void main( String[] argz ){
		double coordinatesA[] = {0.0 , 0.0 };
		double coordinatesB[] = {1.0 , 1.0 };
		Vertex A =  new Vertex( coordinatesA );
		Vertex B =  new Vertex( coordinatesB );
		DirectedEdge dEdge = new DirectedEdge( A, B);
		System.out.println("test");
	}

}
