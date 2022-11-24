package com.pro.wings;

import java.io.Serializable;

public class Vehicle implements Serializable{
	
	String model;
	Engine engine;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String model, Engine engine) {
		super();
		this.model = model;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", engine=" + engine + "]";
	}
	
	

}
