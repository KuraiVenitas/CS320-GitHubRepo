import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testTaskBehavior() {
		TaskService taskService = new TaskService();
		
		// Add Task and manipulate elements
		taskService.addTask("123");
		taskService.updateTaskName("123","New Name");
		taskService.updateTaskDescription("123","New Description");
		taskService.deleteTask("123");
		
		// Attempt to alter the already deleted task
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        taskService.updateTaskName("1", "This should fail"); // Task no longer exists
	    });
		assertEquals("There is no task using this ID", exception.getMessage());
	}
	
	

}
