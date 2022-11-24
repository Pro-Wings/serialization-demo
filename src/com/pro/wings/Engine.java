package com.pro.wings;

import java.io.Serializable;

public class Engine implements Serializable{
	
	int capacity;
	String type;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	

}
