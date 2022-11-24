package com.pro.wings;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	int id;
	String name;
	
	public Employee() {
		super(10,"male");
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name) {
		super(10,"male");
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	private void writeObject(ObjectOutputStream aOutputStream) throws NotSerializableException
	{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream aInputStream) throws NotSerializableException
	{
		throw new NotSerializableException();
	}
	
	
}
