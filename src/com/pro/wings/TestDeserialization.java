package com.pro.wings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	
	public static void main(String[] args) {
		
		Student desrializedStd = null;
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\serialization-demo\\src\\student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			desrializedStd = (Student) ois.readObject();
			
			System.out.println("Deserialized Student : "+desrializedStd);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
