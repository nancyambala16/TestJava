package fileHandlingdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
	static boolean flag;
	
	public static void createFile1(String filepath)
	{
		File file=new File(filepath);
	    try {
			flag=file.createNewFile();
			System.out.println("After creating file:: "+flag);
			if(flag)
			{
				System.out.println("File created...");
			}
			
			else 
			{
				System.out.println("File already exists...");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void createFile2()

	{
	
		try {
			System.out.println("Entering file path...");
			Scanner sc=new Scanner(System.in);
			String path=sc.nextLine();
			FileOutputStream fos=new FileOutputStream(path,true);
			
			System.out.println("Entering file content...");
			String content=sc.nextLine();
			byte b[]=content.getBytes();
			fos.write(b);
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void createFile3()
{
	try {
		Path pathLoc=Paths.get("C:\\Users\\23101997\\Desktop\\Daily Task\\demonstrate2.txt");
		Path newpath=Files.createFile(pathLoc);
		System.out.println("FileCreated");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
	System.out.println(flag);
    //createFile1("C:\\Users\\23101997\\Desktop\\Daily Task\\demonstrate1.txt");
	//createFile2();
	createFile3();
}
}
