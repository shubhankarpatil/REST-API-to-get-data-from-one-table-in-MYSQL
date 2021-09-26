package com.example.Assignment2.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studmarks")
public class StudentMarks2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SemesterNo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Rollno")
	private Student2 student2;
	
	private int Maths;
	private int English;
	private int Physics;
	private int Computer_Science;
	private int Chemistry;
	
	public StudentMarks2() {
		//super();
	}
	
	public StudentMarks2(int semesterNo, int maths, int english, int physics, int computer_Science, int chemistry) {
		super();
		SemesterNo = semesterNo;
		Maths = maths;
		English = english;
		Physics = physics;
		Computer_Science = computer_Science;
		Chemistry = chemistry;
	}
	
	public Student2 getStudent() {
		return student2;
	}

	public void setStudent(Student2 student1) {
		this.student2 = student1;
	}

	public int getSemesterNo() {
		return SemesterNo;
	}
	public void setSemesterNo(int semesterNo) {
		SemesterNo = semesterNo;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getComputer_Science() {
		return Computer_Science;
	}
	public void setComputer_Science(int computer_Science) {
		Computer_Science = computer_Science;
	}
	public int getChemistry() {
		return Chemistry;
	}
	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}
}
