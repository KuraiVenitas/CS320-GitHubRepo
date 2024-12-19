// Name: Asa B Brown
// SNHU | CS-320
//Module 3-2 Contact Service
// 16 November 2024

public class Contact {

	private final String contactID; // Unique and immutable
	private String firstName, lastName, phone, address; // Note: Address must be no longer than 30 characters. Other variables have a limit of 10.
	
	
	Contact(String ID, String first, String last, String number, String contactAddress){
		
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Contact ID cannot be null or longer than 10 characters.");
		}
		if(first == null || first.length() > 10) {
			throw new IllegalArgumentException("First Name cannot be null or longer than 10 characters.");
		}
		if(last == null || last.length() > 10) {
			throw new IllegalArgumentException("Last Name cannot be null or longer than 10 characters.");
		}
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Phone number cannot be null and must be 10 characters.");
		}else if(!number.matches("\\d+")) {
			throw new IllegalArgumentException("Phone number cannot contain letter characters.");
		}
		if(contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Address cannot be null or longer than 30 characters.");
		}
		
		contactID = ID;
		firstName = first;
		lastName = last;
		phone = number;
		address = contactAddress;
	}
	
	// Getters
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setFirstName(String first) {
		
		if(first == null || first.length() > 10) {
			throw new IllegalArgumentException("First Name cannot be null or longer than 10 characters.");
		}else
			firstName = first;
	}
	
	public void setLastName(String last) {
		if(last == null || last.length() > 10) {
			throw new IllegalArgumentException("Last Name cannot be null or longer than 10 characters.");
		}else
			lastName = last;
	}
	
	public void setPhone(String number) {
		
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Phone number cannot be null and must be 10 characters.");
		}else if(number.matches("\\d+"))
			phone = number;
	}
	
	public void setAddress(String contactAddress) {
		if(contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Address cannot be null or longer than 30 characters.");
		}else
			address = contactAddress;
	}
	
}

