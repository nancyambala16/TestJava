package fileHandlingdemo;

import java.io.*;

public class AppendData3 {
	
	public static void writeTest() {
		
	try {
		FileWriter writer=new FileWriter("C:\\Users\\23101997\\Desktop\\Daily Task\\demo57.txt");
		BufferedWriter buff=new BufferedWriter(writer);
		
		buff.write("Welcome to Program world");
		buff.newLine();
		buff.write("Welcome to java world");

	    buff.close();  

		System.out.println("Success");
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	public static void readTest() {
		
	try {
		FileReader reader=new FileReader("C:\\Users\\23101997\\Desktop\\Daily Task\\demo5.txt");
		BufferedReader buff=new BufferedReader(reader);
		FileWriter writer=new FileWriter("C:\\Users\\23101997\\Desktop\\Daily Task\\demo15.txt");
		BufferedWriter bw=new BufferedWriter(writer);
		String line=buff.readLine();
		while(line!=null)
		{
			System.out.println(line);
			bw.write(line);
			
			line=buff.readLine();
		
		}
		bw.close();
		buff.close();
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	
	
public static void main(String[] args) {
	writeTest();
	readTest();
}
}
