import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskTest {
	
	// Valid Tests
	@Test
	void testValidTaskInitialization() {
		Task task = new Task("12345", "Name","Description" );
		assertEquals("12345", task.getTaskID());
		assertEquals("Name", task.getTaskName());
		assertEquals("Description", task.getTaskDescription());
	}
	
	@Test 
	void testValidSetTaskName() {
		Task task = new Task("12345", "Name","Description" );
		task.setName("Chores");
		assertEquals("Chores", task.getTaskName());
	}
	
	@Test 
	void testValidSetTaskDescription() {
		Task task = new Task("12345", "Name","Description" );
		task.setDescription("A list of erands.");
		assertEquals("A list of erands.", task.getTaskDescription());
	}
	
	// Invalid Tests
		@Test
		void testInvalidTaskInitialization() {
			Task task = new Task(null, null, null);
			assertEquals(null, task.getTaskID());
			assertEquals(null, task.getTaskName());
			assertEquals(null, task.getTaskDescription());
		}
		
		@Test 
		void testInvalidSetTaskName() {
			Task task = new Task("12345", "Name","Description" );
			task.setName(null);
			assertEquals(null, task.getTaskName());
		}
		
		@Test 
		void testInvalidSetTaskDescription() {
			Task task = new Task("12345", "Name","Description" );
			task.setDescription(null);
			assertEquals(null, task.getTaskDescription());
		}

}
