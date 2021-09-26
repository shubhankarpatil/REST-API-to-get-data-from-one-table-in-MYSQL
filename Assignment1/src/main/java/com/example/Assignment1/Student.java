package com.example.Assignment1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int Rollno;
		
		private String Student_Name;
		private int Age;
		private String Address;
		private String Mobile_Number;
		private String College_Name;
		
		public Student() {
			super();
		}
		
		public Student(int rollno, String student_Name, int age, String address, String mobile_number, String college_name) {
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

		public String getMobile() {
			return Mobile_Number;
		}

		public void setMobile(String mobile_number) {
			Mobile_Number = mobile_number;
		}

		public String getUniversity() {
			return College_Name;
		}

		public void setUniversity(String college_name) {
			College_Name = college_name;
		}
}	
