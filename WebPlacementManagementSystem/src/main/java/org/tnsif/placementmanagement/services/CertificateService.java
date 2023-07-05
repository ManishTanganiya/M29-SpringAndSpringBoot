package org.tnsif.placementmanagement.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepository;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class CertificateService {

	/*to inject the dependency automatically*/
	@Autowired
	private CertificateRepository repo;
	
	//create and update
		public void create(Certificate certificate)
		{
			repo.save(certificate);
		}
		//retrieve with Specific ID
		public Certificate retrieve(Integer id)
		{
			return repo.findById(id).get();
		}
		//retrieve all records
		public  List<Certificate> retriveAll()
		{
			return repo.findAll();
		}
		
		//delete with specific record
		public void delete(Integer id)
		{
			repo.deleteById(id);
		}
}
