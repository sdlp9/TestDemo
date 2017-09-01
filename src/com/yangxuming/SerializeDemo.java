package com.yangxuming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Young
 *
 */

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String filePath = SerializeDemo.class.getResource("/").getPath();
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\javasource\\TestDemo\\tmp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}