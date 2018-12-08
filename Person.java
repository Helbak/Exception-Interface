package ExampleOfException;

public class Person {

	private boolean alife;
	private String name;
	private int age;

	public Person(boolean alife, String name, int age) {
		super();
		this.alife = alife;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public boolean isalife() {
		return alife;
	}

	public void setalife(boolean alife) {
		this.alife = alife;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [alife=" + alife + ", name=" + name + ", age=" + age + "]";
	}

}
