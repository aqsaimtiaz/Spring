package com.example.restapi.restapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.event.EventListenerMethodProcessor;
import org.springframework.stereotype.Service;

import com.example.restapi.restapi.entities.Employee;

@Service
public class EmployeeService {

	 List<Employee> listEmp = new ArrayList<Employee>();
	 
	 public Employee addEmp(Employee e) {
		 listEmp.add(e);
		 return e;
	 }
	 
	 public List<Employee> getAllEmployee() {
		 
		 return listEmp;
	 }
	 
	 public Employee getEmployeeById(int id) {
		
		Employee e =  listEmp.stream()
		 .filter(p -> p.getId() == id)
		 .findFirst()
		 .get();
		
		return e;
	 }
	 
	 public Employee deleteemployee(int id) {
		 
		 Employee e =  listEmp.stream()
				 .filter(p -> p.getId() == id)
				 .findFirst()
				 .get();
		 
		 listEmp.remove(e);
		 
		 return e;
	 }
	 
	 public Employee updateemployee(int id, Employee e) {
		 
		 listEmp.stream()
				 .map(p -> {
					if(p.getId() == id) {
						
						 p.setId(e.getId());
						 p.setName(e.getName());
						 p.setIsActive(e.getIsActive());
					}
					
					 return p;
				 })
				 .collect(Collectors.toList());
		 
		 
		 return e;
	 }
	 
}
