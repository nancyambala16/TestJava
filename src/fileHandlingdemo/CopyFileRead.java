package fileHandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileRead {

	public static void readwrite()
	{
		FileOutputStream fout=null;
		FileInputStream fin=null;
		String path="C:\\Users\\23101997\\Desktop\\Daily Task\\demo_nancy.txt";
		try {
			fout=new FileOutputStream(path);
			String data="This is testing.Multiple data exist in files";
			byte b[]=data.getBytes();
			fout.write(b);
			System.out.println("Success");
			
			 fin=new FileInputStream(path);
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally {
			
			try {
				fout.close();
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
	
		readwrite();
		
	}
}
