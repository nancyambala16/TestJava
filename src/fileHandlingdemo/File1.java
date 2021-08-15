package fileHandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class File1 {

	static public void readMultipleSources()
	{
		try {
			FileInputStream f1=new FileInputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo1.txt") ;
			FileInputStream f4=new FileInputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo1.txt") ;
			FileInputStream f2=new FileInputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo2.txt") ;
			FileInputStream f3=new FileInputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo2.txt") ;
			
			FileOutputStream f5=new FileOutputStream("C:\\Users\\23101997\\Desktop\\Daily Task\\demo4.txt") ;
		    
			Vector v=new Vector();
			v.add(f1);
			v.add(f2);
			v.add(f3);
			v.add(f4);
			Enumeration e=v.elements();
			SequenceInputStream sis=new SequenceInputStream(e);

			int i=0;
			
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			   f5.write(i);
			   f5.close();
			}
		      
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		readMultipleSources();
	}
	
}
