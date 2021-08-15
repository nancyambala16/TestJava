package fileHandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {

	static public void writesameToMutlipleDestinations()
	{
		try {

			FileInputStream f5=new FileInputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo4.txt") ;
			FileOutputStream f6=new FileOutputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo5.txt") ;
			FileOutputStream f7=new FileOutputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo6.txt") ;
			int i=0;

			while((i=f5.read())!=-1)
			{
				System.out.print((char)i);
				f6.write(i);
				f7.write(i);
				


			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		writesameToMutlipleDestinations();
	}

}
