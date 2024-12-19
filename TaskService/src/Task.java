/* Asa Brown
 * SNHU | CS-320
 * Milestone 4-1: Task Service
 * 23 November 2024
 * */

public class Task {
	
	private final String taskID; // No longer than 10 characters. Not null and not updatable
	private String taskName; // No longer than 20 characters. Not null
	private String taskDescription; // Not longer than 50 characters. Not null
	
	Task(String ID, String name, String description){
		
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Task ID cannot be null or longer than 10 characters.");
		}
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Task name cannot be null or longer than 20 characters.");
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Task description cannot be null or longer than 50 characters.");
		}
		
		taskID = ID;
		taskName = name;
		taskDescription = description;	
	}
	
	//Getters
	String getTaskID() {
		return taskID;
	}
	String getTaskName() {
		return taskName;
	}
	String getTaskDescription() {
		return taskDescription;
	}
	
	//Setters
	void setName(String name) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Task name cannot be null or longer than 20 characters.");
		}else
			taskName = name;
	}
	void setDescription(String description) {
		if(description == null || description.length() > 20) {
			throw new IllegalArgumentException("Task name cannot be null or longer than 20 characters.");
		}else
			taskDescription = description;
	}

}
