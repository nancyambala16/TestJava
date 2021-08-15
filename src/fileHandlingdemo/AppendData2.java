package fileHandlingdemo;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class AppendData2 {

	public static void main(String[] args) {

		try {
			String data = "Tutorials Point is a best website in the world";
			File f1 = new File("C:\\Users\\23101997\\Desktop\\Daily Task\\demo4.txt");
			System.out.println(f1.getName());
			if(!f1.exists()) {
				f1.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(f1,true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(data);
			bw.newLine();
			bw.close();
			System.out.println("Done");

		}
		catch(IOException e){
			e.printStackTrace();	
		}


	}
}
