package fileHandlingdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingData {

	public static void main(String[] args) {

		try {
			String data = "Learning Java";
			byte b[]=data.getBytes();
			File f1 = new File("C:\\Users\\23101997\\Desktop\\Daily Task\\demo9.txt");
			System.out.println(f1.getName());
			if(!f1.exists()) {
				f1.createNewFile();
			}
			//	         else {
			//	        	 f1.delete();
			//	        	 f1.createNewFile();
			//	         }

			FileOutputStream fout=new FileOutputStream(f1,true);
			fout.write(b);
			fout.close();
			System.out.println("Done");

		}
		catch(IOException e){
			e.printStackTrace();	
		}
	}
}
