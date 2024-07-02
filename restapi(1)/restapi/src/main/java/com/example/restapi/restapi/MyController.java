package com.example.restapi.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.restapi.entities.Employee;
import com.example.restapi.restapi.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/employees" )
	public ResponseEntity<List<Employee>> getEmployees() {
	
		List<Employee> e = this.service.getAllEmployee();
		
		if(e.size() == 0 ) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		} else {
			return (ResponseEntity<List<Employee>>) e;
	
		}
	}
	
	@GetMapping(path = "/employees/{id}" )
	public Employee getEmployeeById(@PathVariable("id") int id) {
	
		return this.service.getEmployeeById(id);
	}
	
	@PostMapping(path = "/addemployee")
	public Employee addEmployee(@RequestBody Employee e) {
		
		return this.service.addEmp(e);
	}
	
	@DeleteMapping(path = "/deleteemployee/{id}")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return this.service.deleteemployee(id);
	}
	
	@PutMapping(path = "/updateeemployee/{id}")
	public Employee deleteEmployee(@PathVariable("id") int id, @RequestBody Employee e) {
		return this.service.updateemployee(id, e);
	}
	
}
