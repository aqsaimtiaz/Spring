package com.spring.restjap.restjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/employees" )
	public List<Employee> getEmployees() {
	
		List<Employee> e = (List<Employee>) this.service.getAllEmployee();
		return e;
//		if(e.size() == 0 ) {
//			
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//			
//		} else {
		//	return (ResponseEntity<List<Employee>>) e;
	
//	}
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
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {
		this.service.deleteemployee(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping(path = "/updateeemployee/{id}")
	public Employee deleteEmployee(@PathVariable("id") int id, @RequestBody Employee e) {
		return this.service.updateemployee(id, e);
	}
	
}
