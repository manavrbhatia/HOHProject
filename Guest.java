
public class Guest {

	private String email;
	private String firstName;
	private String lastName; 
	private int phoneNumber; 
	private String address; 
	private double donationAmount; 
	private int timesDonated = 0; 
	
	Guest(){
		email = "";
		firstName = "";
		lastName = "";
		phoneNumber = 0;
		address = ""; 
		donationAmount = 0.0; 
	}
	
	Guest(String firstName, String lastName, String email, int phoneNumber){
		this.firstName = firstName; 
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber; 
	}
	
	Guest(String firstName, String lastName, String email, int phoneNumber, String address){
		this.firstName = firstName; 
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address; 
	}
	
	Guest(String firstName, String lastName, String email, int phoneNumber, double donationAmount){
		this.firstName = firstName; 
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber; 
		this.donationAmount = donationAmount; 
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public double getDonationAmount() {
		return donationAmount;
	}

	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}

	public int getTimesDonated() {
		return timesDonated;
	}

	public void setTimesDonated(int timesDonated) {
		this.timesDonated = timesDonated;
	}
	
	public void makeDonation(double donation) {
		donationAmount += donation; 
		timesDonated++; 
	}
	
	
}
