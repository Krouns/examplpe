package exam;

public class patient {
	
	public int age;
	public String name;
	public int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public patient(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	
}