package fileHandlingdemo;

import java.io.File;

public class CopyFileSort {

	public static void main(String[] args) {
		File file=
				new File("C:\\Users\\23101997\\Desktop\\Daily Task\\Malawi Accumulated Comm\\MW recovery Files");
				
				File filedir[]=file.listFiles();
			//	Arrays.sort(filedir);
				for(File files:filedir)
				{
					
					if(files.isFile())
					{
						System.out.println("This is file---  "+files.getName());
					}
					else if(files.isDirectory())
					{
						System.out.println("This is directory---  "+files.getName());
					}
					else
					{
						System.out.println("This is unknownfile---  "+files.getName());
					}	
						
				}
			       	
	}
	
}


