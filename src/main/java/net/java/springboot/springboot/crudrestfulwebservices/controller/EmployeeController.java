package net.java.springboot.springboot.crudrestfulwebservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import net.java.springboot.springboot.crudrestfulwebservices.repository.EmployeeRepository;
import net.java.springboot.springboot.crudrestfulwebservices.exception.ResourceNotFoundException;
import net.java.springboot.springboot.crudrestfulwebservices.model.Employee;

/*
 * Controller class for Employee Server
 */
@RestController
@RequestMapping("/server")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	/*
	 * Get all Active Employees 
	 */
	@GetMapping("/employees")
	public List<Employee> getAllActiveEmployees() {
		return employeeRepository.findAllActive();
		
	}
	
	/*
	 * Get Active Employee
	 * @pathVariable Employee id of active employee
	 */
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") long employeeId) throws ResourceNotFoundException {
		Employee employee =  employeeRepository.findAllActiveById(employeeId);
		if(employee == null ) {
			throw new ResourceNotFoundException("Employee not found for employee: " + employeeId);
		}
		
		return ResponseEntity.ok(employee);
	}
	
	
	/*
	 * Create a new Employee
	 * @RequestBody is Employee details
	 */
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employeeRepository.save(employee);	
	}
	
	/*
	 * Update an existing employee
	 * @param Employee id to be updated
	 * @ReuestBody updates details of an employee
	 */
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") long employeeId, @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee =  employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for employee: " + employeeId));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setMiddleInitial(employeeDetails.getMiddleInitial());
		employee.setLastName(employeeDetails.getLastName());
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setDateOfBirth(employeeDetails.getDateOfBirth());
		employee.setDateOfEmployment(employeeDetails.getDateOfEmployment());
		employee.setActive(true);
		employeeRepository.save(employee);
		return ResponseEntity.ok().body(employee);
	}
	
	/*
	 * Delete an employee by making them inactive
	 * @PathVariable employee id to be deleted
	 */
	@DeleteMapping("/employees/{id}")
	public ResponseEntity deleteEmployee(@PathVariable(value = "id") long employeeId, @RequestBody Employee employeeDetails,
			@RequestHeader(value="Authorization") String authorizationHeader) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for employee: " + employeeId));
		employee.setActive(false);
		employeeRepository.save(employee);
	return ResponseEntity.ok().build();
	}
	
	
	/*
	 * This method provides all active and inactive employees
	 * Developer use only
	 */
	@GetMapping("/employees-all")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
		
	}

}
