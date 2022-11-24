package com.pro.wings;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectGraph {

	public static void main(String[] args) {

		Engine engine = new Engine(2,"v12");
		
		Vehicle vehicle = new Vehicle("sports", engine);
		

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\vehicle.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(vehicle);
			System.out.println("Vehicle object serialized successfully!!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
