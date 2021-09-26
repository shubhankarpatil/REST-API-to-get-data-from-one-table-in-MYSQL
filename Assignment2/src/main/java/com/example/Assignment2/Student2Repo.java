package com.example.Assignment2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Assignment2.dto.Student2;

@Repository
public interface Student2Repo extends JpaRepository<Student2, Integer>{

	@Query("select s.Student_Name,s.Address,s.Mobile_Number,s.College_Name,sm.Maths,sm.English,sm.Physics,sm.Computer_Science,"
			+ "sm.Chemistry,((sm.Maths+sm.English+sm.Physics+sm.Computer_Science+sm.Chemistry)/5) as Average from Student2 s,"
			+ "StudentMarks2 sm where s.Rollno = :s.Rollno and sm.SemesterNo = :=sm.SemesterNo") 	
	public Student2 getRollSem(@Param("Rollno") Integer Rollno, @Param("SemesterNo") Integer SemesterNo);
}