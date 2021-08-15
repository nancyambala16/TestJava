package fileHandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {

	public static void copy()
	{
		File orgFile=new File("C:\\Users\\23101997\\Desktop\\Daily Task\\Daily Task.txt");
		File copy=new File("C:\\Users\\23101997\\Desktop\\Daily Task\\Daily Task1.txt");
		FileInputStream fis=null;
		FileOutputStream fout=null;
		
		try {
			fis=new FileInputStream(orgFile);
			System.out.println(fis.available());
			fout=new FileOutputStream(copy);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i=fis.read())!=-1)
			{ 
				fout.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Data copied successfully");
	}
	public static void main(String[] args) {
		copy();
	}
}
