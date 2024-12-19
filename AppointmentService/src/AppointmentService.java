import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class AppointmentService {
	public AppointmentService() {
		apptMap = new HashMap<>();
	}private Map<String, Appointment> apptMap;
	
	
	//Add a new appointment
	public void addAppointment(String apptID, Date date, String desc) {
		
		// Check if ID is already in use
		if(apptMap.containsKey(apptID)) {
			throw new IllegalArgumentException("There is already an appointment with this ID:" + apptID);
		}
		// Add an appointment to the map
		Appointment appt = new Appointment(apptID, date , desc);
		apptMap.put(appt.getApptID(), appt);
	}
	
	// Delete Appointment
	public void deleteAppointment(String deleteID) {
		// Check if ID exists in the appt map
		if(!apptMap.containsKey(deleteID)) {
			throw new IllegalArgumentException("There is no appointment with this ID.");
		}
		// Remove the task from the task map
		apptMap.remove(deleteID);
	}
	
	// Update Appointment Date
	public void updateApptDate(String updateID, Date date) {
		// Check if ID exists in the appt map
		if(!apptMap.containsKey(updateID)) {
			throw new IllegalArgumentException("There is no appointment using this ID.");
		}
		Appointment appt = apptMap.get(updateID);
		appt.setApptDate(date);
	}
	
	// Update Appointment Description
	public void updateApptDescription(String updateID, String newDesc) {
		// Check if ID exists in the appt map
		if(!apptMap.containsKey(updateID)) {
			throw new IllegalArgumentException("There is no appointment using this ID.");
		}
		Appointment appt = apptMap.get(updateID);
		appt.setApptDescription(newDesc);
	}

}
