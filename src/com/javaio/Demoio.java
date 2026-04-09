package com.javaio;

import java.io.File;
import java.io.IOException;

public class Demoio {
	
	
 public static void main(String[] args) throws IOException {
	 File file=new File("jfs51.txt");
		//exists();
	 System.out.println(file.exists());
	 
	 //creates a new file mentioned in the file constructor
	 file.createNewFile();
	 
	 File dir=new File("mydirectory");
	 
	 //to create a diercetor use mkdir()
	 dir.mkdir();
	 
	 System.out.println(file.isFile()); //true
	 System.out.println(dir.isDirectory()); //true
}
	

}
