import java.util.HashMap;
import java.util.Map;

public class TaskService {
	
	public TaskService() {
		taskMap = new HashMap<>();
	}private Map<String, Task> taskMap;
	
	//Add a new task
	
	public void addTask(String taskID) {
		
		// Check if ID is already in use
		if(taskMap.containsKey(taskID)) {
			throw new IllegalArgumentException("There is already a task that has this ID.");
		}
		// Add Task to task Map
		Task task = new Task(taskID, "", "");
		taskMap.put(task.getTaskID(), task);
	}
	
	
	// Delete Task
	public void deleteTask(String deleteID) {
		
		// Check if ID exists in the task map
		if(!taskMap.containsKey(deleteID)) {
			throw new IllegalArgumentException("There is no task using this ID.");
		}
		// Remove the task from the task map
		taskMap.remove(deleteID);
	}
	
	
	// Update Task Name
	public void updateTaskName(String updateID, String newName) {
		
		// Check if ID exists in the task map
		if(!taskMap.containsKey(updateID)) {
			throw new IllegalArgumentException("There is no task using this ID.");
		}
		Task task = taskMap.get(updateID);
		task.setName(newName);
	}
	
	// Update Task Description
	public void updateTaskDescription(String updateID, String newDesc) {
		// Check if ID exists in the task map
		if(!taskMap.containsKey(updateID)) {
			throw new IllegalArgumentException("There is no task using this ID.");
		}
		Task task = taskMap.get(updateID);
		task.setDescription(newDesc);
	}
	
}
