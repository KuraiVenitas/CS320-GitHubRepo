import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	//----------------------Valid Tests-------------------//

	@Test
	void testValidContactInitialization() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		assertEquals("12345", contact.getContactID());
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main St.", contact.getAddress());
		}
	
	@Test
	void testValidSetFirstName() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setFirstName("Jenny");
		assertEquals("Jenny", contact.getFirstName());
	}
	
	@Test
	void testValidSetLastName() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setLastName("Moe");
		assertEquals("Moe", contact.getLastName());
	}
	
	@Test
	void testValidSetPhone() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setPhone("1234567890");
		assertEquals("1234567890", contact.getPhone());
	}
	
	@Test
	void testValidSetAddress() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setAddress("123 Main St.");
		assertEquals("123 Main St.", contact.getAddress());
	}
	
	
	
	//----------------------Invalid Tests-------------------//
	
	@Test
	void testInvalidContactInitialization() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		assertEquals("12345      ", contact.getContactID());
		assertEquals("John       ", contact.getFirstName());
		assertEquals("Doe        ", contact.getLastName());
		assertEquals("1234567890 ", contact.getPhone());
		assertEquals("123 Main St.", contact.getAddress());
		}
	
	
	@Test
	void testInvalidSetFirstName() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setFirstName("Jenny      ");
		assertEquals("Jenny      ", contact.getFirstName());
	}
	
	@Test
	void testInvalidSetLastName() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setLastName("Moe        ");
		assertEquals("Moe         ", contact.getLastName());
	}
	
	@Test
	void testInvalidSetPhone() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setPhone("1234567890 ");
		assertEquals("1234567890 ", contact.getPhone());
	}
	
	@Test
	void testInvalidSetAddress() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St.");
		contact.setAddress("123 Main St.                              ");
		assertEquals("123 Main St.                              ", contact.getAddress());
	}

}
