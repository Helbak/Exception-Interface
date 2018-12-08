package ExampleOfException;

public class Student extends Person implements VoenCom {

	private int numberOfGroup;
	private double rating;

	

	public Student(boolean alife, String name, int age, int numberOfGroup, double rating) {
		super(alife, name, age);
		this.numberOfGroup = numberOfGroup;
		this.rating = rating;
	}

	public Student() {
		super();
	}

	
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNumberOfGroup() {
		return numberOfGroup;
	}

	public void setNumberOfGroup(int numberOfGroup) {
		this.numberOfGroup = numberOfGroup;
	}

	

	

	

	

	

	@Override
	public String toString() {
		return "Student [numberOfGroup=" + numberOfGroup + ", rating=" + rating + ", isalife()=" + isalife()
				+ ", getName()=" + getName() + ", getage()=" + getage() + "]";
	}

	@Override
	public VoenCom[] whoIsReady() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
