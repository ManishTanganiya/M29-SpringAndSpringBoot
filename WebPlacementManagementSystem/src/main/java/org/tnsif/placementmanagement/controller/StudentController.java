package org.tnsif.placementmanagement.controller;

import java.util.NoSuchElementException;

import org.tnsif.placementmanagement.entities.Student;
import org.tnsif.placementmanagement.services.StudentService;
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
public class StudentController {
	@Autowired
	private StudentService service;
	
	//RESTful API's method
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		service.create(student);
	}
	
	@GetMapping("/student/{id}")
	public void searchStudentById(@PathVariable Integer id) {
		service.retrieveById(id);
	}
	
	@GetMapping("/student/{}")
	public void searchStudentByHallTicketNo(Long hallticketno) {
		
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		try {
			Student s = service.retrieveById(id);
			service.create(student);
			return new ResponseEntity<Student>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
}
