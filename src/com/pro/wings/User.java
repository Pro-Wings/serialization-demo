package com.pro.wings;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	int userId;
	String userName;
	String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	private void writeObject(ObjectOutputStream oos) throws IOException
	{
		oos.writeInt(userId);
		oos.writeUTF(userName);
		oos.writeUTF("abc"+password+123);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException 
	{
		userId = ois.readInt();
		userName = ois.readUTF();
		String encodedPassword = ois.readUTF();
		password = encodedPassword.substring(3, encodedPassword.length()-3);
	}
}
