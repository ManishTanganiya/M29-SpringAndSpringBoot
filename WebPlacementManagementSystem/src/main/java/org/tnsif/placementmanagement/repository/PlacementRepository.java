package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.Placement;

/*JPA repository is an interface which contains all the
 * JPA CRUD operations which is required for Springboot*/
public interface PlacementRepository extends JpaRepository<Placement,Integer>{

}
