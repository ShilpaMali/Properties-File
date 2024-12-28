package com.velocity.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) {

		/*String username = "velocityjava";
		String password = "master";*/
		try {
			// Step-1-
			FileInputStream fis = new FileInputStream(
					"E:\\Velocity java full stack 14 sep 2024 batch\\PropertiesDemo\\test.properties");
			// Step-2-
			Properties properties = new Properties();
			// Step-3- use load() method
			properties.load(fis);
			// Step-4- getProperty() method
			String uname = properties.getProperty("usernames"); // velocity
			String pass = properties.getProperty("password"); // 12345
			// Step-5-
			System.out.println("Username is>>" + uname);
			System.out.println("Password is>>" + pass);
			//operation- y
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
