package classwork19;

public class Passenger {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String placeNumber;
	
	public Passenger() {
		
	}
	
	public Passenger(String firstName, String middleName, String lastName, int age, String placeNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.placeNumber = placeNumber;
	}
	
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age="
				+ age + ", placeNumber=" + placeNumber + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPlaceNumber() {
		return placeNumber;
	}
	
	public void setPlaceNumber(String placeNumber) {
		this.placeNumber = placeNumber;
	}
}
