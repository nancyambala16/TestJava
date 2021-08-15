package fileHandlingdemo;

import java.io.File;
import java.io.IOException;

public class File4 {	

	public static void main(String[] args) {
		File f5=new File("C:\\Users\\23101997\\Desktop\\Daily Task\\demo") ;
       if(f5.exists()!=true)
       {
    	   System.out.println("Directory does not exist.....");
    	   if(f5.mkdir()==true)
    	   {
    		   System.out.println("Directory created successfully...");
    		   
    	   }
    	   else
    		   System.out.println("unable to create directory...");
    		   
       }
       else
       {
    	   System.out.println("Directory exists already");
       }
       System.out.println(f5.getAbsolutePath());
       f5.delete();
	}
	
}
