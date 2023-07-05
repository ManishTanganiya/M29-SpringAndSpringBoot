package org.tnsif.placementmanagement.controller;

import java.util.List;
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
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.services.CertificateService;

@RestController
public class CertificateController {
	@Autowired
	private CertificateService service;
	
	//RESTful API's method
		@PostMapping("/certificate")
		public void insert(@RequestBody Certificate certificate)
		{
			service.create(certificate);
		}
		
		@DeleteMapping("/certificate/{id}")
		public void remove(@PathVariable Integer id)
		{
			service.delete(id);
		}
		
		@GetMapping("/certificate")
		public List<Certificate>retriveA()
		{
			return service.retriveAll();
		}
		
		@GetMapping("/certificate/{id}")
		public ResponseEntity<Certificate> retreive(@PathVariable Integer id)
		{
			try {
				Certificate certificate=service.retrieve(id);
				return new ResponseEntity<Certificate>(certificate,HttpStatus.OK);

			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
		}
		
		@PutMapping("/certificate/{id}")
		public ResponseEntity<Certificate>update (@RequestBody Certificate certificate,@PathVariable Integer id)
		{
			try {
			Certificate a=service.retrieve(id);
			service.create(certificate);
			return new ResponseEntity<Certificate>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
		}
}



