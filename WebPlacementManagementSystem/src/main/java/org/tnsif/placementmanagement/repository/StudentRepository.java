package org.tnsif.placementmanagement.repository;

import org.tnsif.placementmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
