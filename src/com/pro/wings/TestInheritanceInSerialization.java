package com.pro.wings;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestInheritanceInSerialization {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.age = 10;
		e1.gender = "male";
		e1.id = 1234;
		e1.name = "ABC";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try
		{
			fos = new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\employee.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			System.out.println("Employee Object serialized successfully!!!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some error while serialization!!");
			e.printStackTrace();
		}
		finally {
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
