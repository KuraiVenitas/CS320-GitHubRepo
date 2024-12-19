/* Asa Brown
 * SNHU | CS-320
 * Milestone 5-1: Appointment Service
 * 25 November 2024
 */
import java.util.Date;

import java.util.Calendar;

public class Appointment {
	
	private final String apptID; // No longer than 10 characters. Not null, not updatable.
	private Date apptDate; // Cannot be scheduled before the current date or be null. 
	private String apptDesc; // No longer than 50 characters or null. 
		
	Appointment(String ID, Date date, String desc){
		if(ID == null || ID.length() > 10)
			throw new IllegalArgumentException("The ID cannot be longer than 10 characters or null.");
		
		if(date == null || stripTime(date).before(stripTime(new Date())))
			throw new IllegalArgumentException("The date cannot be scheduled before today's date.");
		
		if(desc == null || desc.length() > 50)
			throw new IllegalArgumentException("The description cannot be longer than 50 characters or null.");
		
		apptID = ID; apptDate = date; apptDesc = desc;
	}
	
	public String getApptID() { return apptID; }
	public Date getApptDate() {	return apptDate;}
	public String getApptDescription() { return apptDesc;}
	
	public void setApptDate(Date date) {
		
		if(date == null || stripTime(date).before(stripTime(new Date())))
			throw new IllegalArgumentException("The date cannot be scheduled before today's date.");
		
		if(stripTime(apptDate).equals(stripTime(date)))
			throw new IllegalArgumentException("An appointment has already been scheduled for this date.");
		apptDate = date;
	}
	
	public void setApptDescription(String desc) {
		
		if(desc == null || desc.length() > 50)
			throw new IllegalArgumentException("The description cannot be longer than 50 characters or null.");
		
		apptDesc = desc;
	}
	
	// Additional class to help remove hours, minutes, seconds and milliseconds
	public Date stripTime(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.set(Calendar.HOUR_OF_DAY, 0);
	    cal.set(Calendar.MINUTE, 0);
	    cal.set(Calendar.SECOND, 0);
	    cal.set(Calendar.MILLISECOND, 0);
	    return cal.getTime();
	}
	
}
