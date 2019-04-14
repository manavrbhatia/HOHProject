import java.util.ArrayList;

public class Table {
	
	public Table(ArrayList<Guest> guests, int tableNumber, int pledgeAmount, String tableOwner, String firstName,
			String lastName, String email, String checkNumber, String companyName, boolean matchingDonation) {
		super();
		this.guests = guests;
		this.tableNumber = tableNumber;
		this.pledgeAmount = pledgeAmount;
		this.tableOwner = tableOwner;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.checkNumber = checkNumber;
		this.companyName = companyName;
		this.matchingDonation = matchingDonation;
	}
	private ArrayList<Guest> guests = new ArrayList<Guest>(); 
	private int tableNumber, pledgeAmount; 
	private String tableOwner, firstName, lastName, email, checkNumber, companyName;
	private boolean matchingDonation; 
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public boolean isMatchingDonation() {
		return matchingDonation;
	}
	public void setMatchingDonation(boolean matchingDonation) {
		this.matchingDonation = matchingDonation;
	}
	public ArrayList<Guest> getGuests() {
		return guests;
	}
	public void setGuests(ArrayList<Guest> guests) {
		this.guests = guests;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public int getPledgeAmount() {
		return pledgeAmount;
	}
	public void setPledgeAmount(int pledgeAmount) {
		this.pledgeAmount = pledgeAmount;
	}
	public String getTableOwner() {
		return tableOwner;
	}
	public void setTableOwner(String tableOwner) {
		this.tableOwner = tableOwner;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	} 
	
	
	
	

}
