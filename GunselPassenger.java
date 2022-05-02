package classwork19;

public class GunselPassenger {
	private String firstName;
	private String secondName;
	private String lastName;
	private int yearsOld;
	private String seatNumber;
	@Override
	public String toString() {
		return "GunselPassenger [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName
				+ ", yearsOld=" + yearsOld + ", seatNumber=" + seatNumber + "]";
	}
	public GunselPassenger(String firstName, String secondName, String lastName, int yearsOld, String seatNumber) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.yearsOld = yearsOld;
		this.seatNumber = seatNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}
