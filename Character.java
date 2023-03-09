package Ejercicio_4;

public class Character extends Person {
	private String name;
	private String adult;
	private String married;
	private String student;
	private String children;
	
	public Character(String name, String adult, String married, String student, String children) {
		this.name = name;
		this.adult = adult;
		this.married = married;
		this.student = student;
		this.children = children;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdult() {
		return adult;
	}
	
	public String getMarried() {
		return married;
	}
	public String getStudent() {
		return student;
	}
	
	public String getChildren() {
		return children;
	}
	
	public String getInfo() {
		return String.format("%s: %s, %s, %s, %s.", name, adult, married, student, children);
	}
}