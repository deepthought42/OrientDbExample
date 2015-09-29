package orientDbExample;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;


public class TestPersistor {

	public static void main(String[] args) {
		ObjectDefinition obj1 = new ObjectDefinition("b","a");
		ObjectDefinition obj2 = new ObjectDefinition("c","a");
		
		OrientGraph graph = new OrientGraph("plocal:test", "user", "pass");
		
		if (graph.getVertexType("ObjectDefinition") == null){
            graph.createVertexType("ObjectDefinition");
            System.out.println("Created person vertex type");
        }
		
		Vertex from_vertex = graph.addVertex("class:ObjectDefinition");
		from_vertex.setProperty("name", obj1.getName());
		from_vertex.setProperty("type", obj1.getType());

		Vertex to_vertex = graph.addVertex("class:ObjectDefinition");
		to_vertex.setProperty("name", obj2.getName());
		to_vertex.setProperty("type", obj2.getType());
		
		Edge edge = graph.addEdge(1, from_vertex, to_vertex, "EDGE CASE");
		edge.setProperty("LABEL", "EDGE CASE");
		
		
        displayAllVertices(getAllVertices(graph, "ObjectDefinition"), "name");


	}
	
	private static Iterable<Vertex> getAllVertices(OrientGraph graph, String classname) {
        return graph.getVerticesOfClass(classname);
    }
	
	private static void displayAllVertices(Iterable<Vertex> it, String propertyName) {
        System.out.println("The vertices in the graph are:");
        for (Vertex v: it)
            System.out.println(v + " " + v.getProperty(propertyName));
    }
}
