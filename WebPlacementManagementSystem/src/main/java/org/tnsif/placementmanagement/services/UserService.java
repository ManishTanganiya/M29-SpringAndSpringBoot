package org.tnsif.placementmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;	
			//create and update
		public void create(User user) {
			repo.save(user);
		}
		
		//retrieve with specific ID
		public User retrieveById(Integer id) {
			return repo.findById(id).get();
		}		
		//delete with specific Id
		public void delete(Integer id) {
			repo.deleteById(id);
		}
	
}

