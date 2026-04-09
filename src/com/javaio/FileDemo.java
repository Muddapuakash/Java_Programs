package com.javaio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dir=new File("mynotes");
		if(!dir.exists()) {
			if(dir.mkdir()) {
				System.out.println("Directory is created "+dir.getAbsolutePath());
			}else {
				System.out.println("Failed to create the directory");
			}
		}else {
			System.out.println("Directory already existed "+dir.getAbsolutePath());
		}
		//create file objects
		File file1=new File(dir,"File1.txt");
		File file2=new File(dir,"File2.txt");
		File file3=new File(dir,"File3.txt");
		File file4=new File(dir,"File4.txt");
		
		System.out.println("file1.txt created: "+file1.createNewFile());
		System.out.println("file2.txt created: "+file2.createNewFile());
		System.out.println("file3.txt created: "+file3.createNewFile());
		System.out.println("file4.txt created: "+file4.createNewFile());
		
		//list the files presnet in a directory
		String[] filenames=dir.list();
		if(filenames==null || filenames.length ==0) {
			System.out.println("directory is empty");
		}else {
			System.out.println("contents of directory: ");
			for(String filenames1:filenames) {
				System.out.println(filenames1);
			}
		}
		System.out.println(Arrays.toString(dir.list()));
	}

}
