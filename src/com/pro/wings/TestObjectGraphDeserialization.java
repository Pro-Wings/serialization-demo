package com.pro.wings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectGraphDeserialization {

	public static void main(String[] args) {

		Vehicle OutVehicle = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\vehicle.txt");
			ois = new ObjectInputStream(fis);
			
			OutVehicle = (Vehicle) ois.readObject();

			System.out.println("Vehicle object deserialized successfully!!!"+OutVehicle);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
