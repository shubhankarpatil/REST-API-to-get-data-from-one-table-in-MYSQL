package com.example.Assignment2.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student2 {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="Rollno")
		private int Rollno;
		
		@OneToOne(cascade=CascadeType.ALL)
		private StudentMarks2 studentmarks2;
		
		private String Student_Name;
		private int Age;
		private String Address;
		private String Mobile_Number;
		private String College_Name;
		
		public Student2() {
			//super();
		}
		
		public Student2(int rollno, String student_Name, int age, String address, String mobile_number, String college_name) {
			super();
			Rollno = rollno;
			Student_Name = student_Name;
			Age = age;
			Address = address;
			Mobile_Number = mobile_number;
			College_Name = college_name;
		}
		

		public int getRollno() {
			return Rollno;
		}

		public void setRollno(int rollno) {
			Rollno = rollno;
		}

		public String getStudent_Name() {
			return Student_Name;
		}

		public void setStudent_Name(String student_Name) {
			Student_Name = student_Name;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public StudentMarks2 getStudentmarks() {
			return studentmarks2;
		}

		public void setStudentmarks(StudentMarks2 studentmarks2) {
			this.studentmarks2 = studentmarks2;
		}

		public String getMobile_Number() {
			return Mobile_Number;
		}

		public void setMobile_Number(String mobile_Number) {
			Mobile_Number = mobile_Number;
		}

		public String getCollege_Name() {
			return College_Name;
		}

		public void setCollege_Name(String college_Name) {
			College_Name = college_Name;
		}
}		
