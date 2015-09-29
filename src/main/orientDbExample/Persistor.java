package orientDbExample;


import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;

public class Persistor {
	OrientGraph graph = null;
	
	public Persistor() {
		this.graph = new OrientGraph("plocal:Thoth", "admin", "admin");
	}
	
	public Vertex addVertex(){
		Vertex vertex = graph.addVertex(null);
		
		return vertex;
	}
	
	public OrientGraph getGraph(){
		return this.graph;
	}
	
	public void save(){
		this.graph.commit();
	}
	
	public Edge addEdge(Vertex v1, Vertex v2){
		return graph.addEdge(null, v1, v2, "lives");
	}

}
