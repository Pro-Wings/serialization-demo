package com.pro.wings;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\student.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			System.out.println("Student object serialized successfully!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
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
