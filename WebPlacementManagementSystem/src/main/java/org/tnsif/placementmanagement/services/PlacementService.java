package org.tnsif.placementmanagement.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.repository.PlacementRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

	/*to inject the dependency automatically*/
	@Autowired
	private PlacementRepository repo;
	
	//create and update
		public void create(Placement placement)
		{
			repo.save(placement);
		}
		//retrieve with Specific ID
		public Placement retrieve(Integer id)
		{
			return repo.findById(id).get();
		}
		//retrieve all records
		public  List<Placement> retriveAll()
		{
			return repo.findAll();
		}
		
		//delete with specific record
		public void delete(Integer id)
		{
			repo.deleteById(id);
		}
}
