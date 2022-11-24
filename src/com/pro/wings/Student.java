package com.pro.wings;

import java.io.Serializable;

public class Student implements Serializable {
	
	 int roll;
	 transient final String name;
	 transient static String schoolName = "ABC School";
	 
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
	
}
