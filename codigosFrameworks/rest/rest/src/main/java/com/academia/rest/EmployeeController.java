package com.academia.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private final List<Empleado> employees = new ArrayList<>();
	private final AtomicLong idCounter = new AtomicLong(1);

	public EmployeeController() {
		employees.add(new Empleado(idCounter.getAndIncrement(), "John Doe", "Software Engineer"));
		employees.add(new Empleado(idCounter.getAndIncrement(), "Jane Smith", "Data Scientist"));
	}

	@GetMapping
	public List<Empleado> getAllEmployees() {
		return employees;
	}

	@GetMapping("/{id}")
	public Empleado getEmployeeById(@PathVariable Long id) {
		return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
	}

	@PostMapping
	public Empleado createEmployee(@RequestBody Empleado employee) {
		employee.setId((int) (idCounter.getAndIncrement()));
		employees.add(employee);
		return employee;
	}

	@PutMapping("/{id}")
	public Empleado updateEmployee(@PathVariable Long id, @RequestBody Empleado updatedEmployee) {
		Empleado employee = getEmployeeById(id);
		if (employee != null) {
			employee.setNombre(updatedEmployee.getNombre());
			employee.setEmail(updatedEmployee.getEmail());
		}
		return employee;
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employees.removeIf(employee -> employee.getId() == id);
	}
}