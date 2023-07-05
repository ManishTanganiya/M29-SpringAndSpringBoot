package org.tnsif.placementmanagement.controller;

import java.util.NoSuchElementException;

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
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	//RESTful API's method
	@PostMapping("/user")
	public void addCertificate(@RequestBody User user) {
		service.create(user);
	}
	
	@GetMapping("/user/{id}")
	public void searchUserById(@PathVariable Integer id) {
		service.retrieveById(id);
	}
	

	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateStudent(@RequestBody User user, @PathVariable Integer id) {
		try {
			User u = service.retrieveById(id);
			service.create(user);
			return new ResponseEntity<User>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
}

