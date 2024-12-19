import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

class AppointmentServiceTest {

	@Test
	void testAppointmentBehavior() {
		AppointmentService apptService = new AppointmentService();
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 1, 3);
		// Add Appointment and manipulate elements
		apptService.addAppointment("12345", cal.getTime(), "Description");
		
		cal.set(2025, 1, 5);
		apptService.updateApptDate("12345", cal.getTime());
		apptService.updateApptDescription("12345","New Description");
		apptService.deleteAppointment("12345");
	}
	
	
	@Test
	void testInvalidAppointmentBehavior() {
		AppointmentService apptService = new AppointmentService();
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 1, 3);
		// Add Appointment and manipulate elements
		apptService.addAppointment("12345", cal.getTime(), "Description");
		
		cal.set(2025, 1, 5);
		apptService.updateApptDate("12345", cal.getTime());
		apptService.updateApptDescription("12345","New Description");
		apptService.deleteAppointment("12345");
		// Attempt to alter the already deleted appointment
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        apptService.updateApptDescription("12345", "This should fail"); // Appointment isn't scheduled
	    });
		assertEquals("There is no appointment scheduled with this ID", exception.getMessage());
		
	
	}
	
	

}

