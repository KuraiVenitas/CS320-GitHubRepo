import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactBehavior() {
		ContactService contactService = new ContactService();
		
		// Add Task and manipulate elements
		contactService.addContact("12345");
		contactService.updateContactFirstName("12345","John");
		contactService.updateContactLastName("12345","Doe");
		contactService.updateContactPhone("12345","1234567890");
		contactService.updateContactAddress("12345","123 Main St.");
		contactService.deleteContact("12345");
		
		// This test was conducted with and without the following lines of code.
		// Both tests were successful in achieving the desired result
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        contactService.updateContactFirstName("12345", "This should fail"); // Task no longer exists
	    });
		assertEquals("There is no contact using this ID", exception.getMessage());
	
	}
	
	

}
