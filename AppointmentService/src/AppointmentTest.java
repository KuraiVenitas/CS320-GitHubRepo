import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

class AppointmentTest {

	@Test
	void testApptInit() {
		Appointment appt = new Appointment("12345", new Date(), "Description");
		assertEquals("12345",appt.getApptID());
		assertEquals(new Date(),appt.getApptDate());
		assertEquals("Description",appt.getApptDescription());
	}
	
	@Test
	void testSetApptDate() {
		
		Appointment appt = new Appointment("12345", new Date(), "Description");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2025);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		Date newDate = cal.getTime();
		
		appt.setApptDate(newDate);
		assertEquals(newDate, appt.getApptDate());
	}
	
	@Test
	void testApptDescription() {
		Date date = new Date(); // Current date
		Appointment appt = new Appointment("12345", date, "Description");
		appt.setApptDescription("This is a new description.");
		assertEquals("This is a new description.",appt.getApptDescription());
	}
	
	
	@Test
	void testInvalidApptInit() {
		Appointment appt = new Appointment(null, null, null);
		assertEquals(null, appt.getApptID());
		assertEquals(null, appt.getApptDate());
		assertEquals(null, appt.getApptDescription());
	}
	
	
	@Test
	void testInvalidSetApptDate() {
		Appointment appt = new Appointment("12345", null, "Description");
		assertEquals(null, appt.getApptDate());
	}
	
	
	@Test
	void testInvalidApptDescription() {
		Appointment appt = new Appointment("12345", new Date(), null);
		assertEquals(null,appt.getApptDescription());
	}

}

