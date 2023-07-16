
public class employee {
	private int id;
	public String name;
	
	// Source -> generate constructor using fields
	public employee(int id, String name) {
		super();				//call parent class constructor
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id; 
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
