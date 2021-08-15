package fileHandlingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppendData {

	public static void main(String[] args) {

		try {
			String path="C:\\Users\\23101997\\Desktop\\Daily Task\\demo9.txt";
	
			FileReader reader=new FileReader(path);
			File f1=new File(path);
			int size=(int)f1.length();
			char data[]=new char[size];
			reader.read(data);
			String s1=new String(data);
			System.out.println(s1);
			reader.close();
			
		
		}
		catch(IOException e){
			e.printStackTrace();	
		}
	}
}
