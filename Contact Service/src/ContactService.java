import java.util.HashMap;
import java.util.Map;

public class ContactService {

	public ContactService() {
		contactMap = new HashMap<>();
	}
	private Map<String, Contact> contactMap;
	
	// Add Contact function by ID
	public void addContact(String contactID) {
		//Check to see if the contact already exists within the collection
		if(contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("There is already a contact that has this ID.");
		}else {
			Contact contact = new Contact(contactID, "", "", "1234567890", "");
			contactMap.put(contact.getContactID(), contact);
		}
	}
	
	// Delete Contact Function
	public void deleteContact(String contactID) {
		//Check to see if the contact already exists within the collection
		if(!contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("This ID could not be found within your contacts.");
		}else
			contactMap.remove(contactID);
	}
	
	// Update Contact Information	
	public void updateContactFirstName(String contactID, String firstName) {
		if(!contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
		if(firstName == null) {
			throw new IllegalArgumentException("The first name of a contact cannot be null.");
		}
		Contact contact = contactMap.get(contactID);
		contact.setFirstName(firstName);
	}
	
	public void updateContactLastName(String contactID, String lastName) {
		if(!contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
		if(lastName == null) {
			throw new IllegalArgumentException("The last name of a contact cannot be null.");
		}
		Contact contact = contactMap.get(contactID);
		contact.setLastName(lastName);
		
	}
	
	public void updateContactPhone(String contactID, String phone) {
		if(!contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
		if(phone == null) {
			throw new IllegalArgumentException("The phone number for a contact cannot be null.");
		}
		
		Contact contact = contactMap.get(contactID);
		contact.setPhone(phone);
	}
	
	public void updateContactAddress(String contactID, String address) {
		
		if(!contactMap.containsKey(contactID)) {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
		if(address == null) {
			throw new IllegalArgumentException("The address for a contact cannot be null.");
		}
		Contact contact = contactMap.get(contactID);
		contact.setAddress(address);
	
	}

	
	
	
	
}
