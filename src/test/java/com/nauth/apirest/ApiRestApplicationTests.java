package com.nauth.apirest;

import com.nauth.apirest.model.Task;
import com.nauth.apirest.repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ApiRestApplicationTests {

	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private TaskService taskService;



	@Test
	void testFindTaskById() {
		Task testTask = new Task();
		testTask.setId(1L);
		testTask.setDescription("Contratar");
		testTask.setState("A");
		taskRepository.save(testTask);

		Task result = taskService.getTaskById(1L);

		Assertions.assertNotNull(result, "El resultado no debe ser nulo");
		Assertions.assertEquals(testTask.getId(), result.getId(), "El Id de la tarea debe ser el mismo");
	}

}
