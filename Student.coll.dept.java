package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Student Name:Parashu");
	}
		public void studentDept() {
			System.out.println("Studnet Department:ECE");
		}
		public void studentId() {
			System.out.println("Student ID:EC10682");
		}
		public static void main(String[] args) {
			
			
			System.out.println("                College Details                          ");
			College obj1=new College();
			obj1.collegeName();
			obj1.collegeCode();
			obj1.collegeRank();
			
			
			System.out.println("                Department                                ");
			Department obj2=new Department();
			obj2.deptName(); 
			
			
			System.out.println("                Student Details                           ");
			Student obj3=new Student();
			obj3.studentName();
			obj3.studentDept();
			obj3.studentId();
		}
	}


