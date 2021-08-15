package fileHandlingdemo;

import java.io.File;
import java.io.IOException;

public class File3 {	

	public static void main(String[] args) {
		File f5=new File("C:\\Users\\23101997\\Desktop\\Daily Task\\demo") ;
		File f6=new File("C:\\Users\\23101997\\Desktop\\Daily Task\\demo\\demo1.txt") ;

       if(f5.exists()!=true)
       {
    	   System.out.println("Directory does not exist.....");
    	   if(f5.mkdir()==true)
    	   {
    		   System.out.println("Directory created successfully...");
    		   if(f6.exists()!=true)
    		   {
    			   System.out.println("File does not exist");
    			   try {
					if(f6.createNewFile()==true)
					   {
						   System.out.println("File created successfully..");
					   }
					else
					{
						System.out.println("Failed to create file");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		   }
    		   else
    		   {
    			   System.out.println("File already exist");

    		   }
    		   
    	   }
    	   else
    		   System.out.println("unable to create directory...");
    		   
       }
       else
       {
    	   System.out.println("Directory exists already");
       }
       System.out.println(f5.getAbsolutePath());
       System.out.println(f6.getAbsolutePath());
       System.out.println(f6.canWrite());
       f6.setWritable(true);
       System.out.println(f6.canWrite());
       System.out.println(f6.canRead());
      // f6.delete();
      // f5.delete();
	}
	
}
