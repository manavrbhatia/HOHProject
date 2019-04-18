import java.util.ArrayList;

public class TableTester {
	
	public static void main(String args[]) {
		ArrayList<Guest> guests = new ArrayList<Guest>(); 
		guests.add(new Guest()); 
		guests.add(new Guest()); 
		guests.add(new Guest()); 
		guests.add(new Guest()); 
		
		Table one = new Table(guests, 1, 0, "shiv rammurthy", "shiv", "rammurthy", "email", "444444", "Adobe", false );
		
		System.out.println(one.getTableNumber());
		System.out.println(one.getPledgeAmount());
		System.out.println(one.getFirstName());
		System.out.println(one.getLastName());
		System.out.println(one.getEmail());
		System.out.println(one.getCheckNumber());
		System.out.println(one.getCompanyName());
		
	}

}
