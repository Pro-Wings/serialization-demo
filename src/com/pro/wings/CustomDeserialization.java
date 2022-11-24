package com.pro.wings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomDeserialization {

	public static void main(String[] args) {

		User user = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\user.txt");
			ois = new ObjectInputStream(fis);

			user = (User) ois.readObject();

			System.out.println("User Object deserialized successfully!!!  :  " + user);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some error while deserialization!!");
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
