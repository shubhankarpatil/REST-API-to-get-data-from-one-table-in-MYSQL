package com.example.Assignment1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("from Student where Student_Name = :Student_Name")
	public Student findByName(@Param("Student_Name") String Student_Name);
	
	@Query("from Student where Mobile_Number = :Mobile_Number")
	public Student findByMobile(@Param("Mobile_Number") String Mobile_Number);
	
}
