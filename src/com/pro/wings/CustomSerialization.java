package com.pro.wings;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerialization {

	public static void main(String[] args) {

		User user = new User(1234, "Ram", "R@m1234");

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\user.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(user);
			System.out.println("User Object serialized successfully!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some error while serialization!!");
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
