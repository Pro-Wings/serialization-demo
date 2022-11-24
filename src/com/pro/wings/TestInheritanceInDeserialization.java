package com.pro.wings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestInheritanceInDeserialization {
	
	public static void main(String[] args) {
		
		Employee empOut = new Employee();
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try
		{
			fis = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\employee.txt");
			ois = new ObjectInputStream(fis);
			
			empOut = (Employee) ois.readObject();
			
			System.out.println("Employee Object deserialized successfully!!!  :  " +empOut );
			System.out.println(empOut.age);
			System.out.println(empOut.gender);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some error while deserialization!!");
			e.printStackTrace();
		}
		finally {
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
