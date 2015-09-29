package orientDbExample;

/**
 * Defines objects that are available to the system for learning against
 */
public class ObjectDefinition {

	public ObjectDefinition(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public ObjectDefinition(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public ObjectDefinition(){}

	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "ObjectDefinition: "+ this.id + ", " + this.type + ", " + this.name;

	}
	
	private int id;
	private String type;
	private String name;

}
