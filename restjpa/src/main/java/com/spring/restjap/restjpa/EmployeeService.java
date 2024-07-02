package com.spring.restjap.restjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	 
	 public Employee addEmp(Employee e) {
		return this.employeeRepository.save(e);
	 }
	 
	 public List<Employee> getAllEmployee() {
		 	List<Employee> list  = (List<Employee>) this.employeeRepository.findAll();
		 	
		 	return list;
		
	 }
	 
	 public Employee getEmployeeById(int id) {
		
		return this.employeeRepository.findById(id).get();
		
	 }
	 
	 public void deleteemployee(int id) {
		 
		this.employeeRepository.deleteById(id);
	 }
	 
	 public Employee updateemployee(int id, Employee e) {
		 
		Employee emp = this.employeeRepository.findById(id).get();
		emp.setId(id);
		emp.setName(e.getName());
		emp.setIsActive(e.getIsActive());
		 
		 return e;
	 }
	 
}
