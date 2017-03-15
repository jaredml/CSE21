
public class Person {
	private String name;
	private int age;
	private String location;

	public Person() {
		this.name = "";
		this.age = 0;
		this.location = "";
	}
	public Person(String name, int age, String location) {
		// Fill-in
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public void setName(String name) {
		// Fill-in
		this.name = name;
		}

	public String getName() {
		// Fix
		return name;
	}

	public void setAge(int age) {
		// Fill-in
		this.age = age;
	}

	public int getAge() {
		//		Fix	
		return age;
	}
	public void setLocation(String location) {
		// Fill-in
		this.location = location;
	}

	public String getLocation() {
		//	Fix
		return location;
	}

}
