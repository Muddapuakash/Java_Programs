package com.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
   public static void main(String[] args) throws IOException {
		/*
		 * File f=new File("iostream.txt"); 
		 * f.createNewFile(); FileWriter write=new
		 * FileWriter(f);
		 */
	   File file=new File("pledge.txt");
	  // FileWriter writer=null;
	   try (FileWriter writer = new FileWriter(file, false);){
		  
		   //FileWriter writer=new FileWriter("pledge.txt");
		   //FileWriter writer=new FileWrite(file);
		   //FileWriter writer=new FileWriter('pledge.txt",true);
		   
		//writer = new FileWriter(file, true);
		writer.write("India is my country");
		writer.write("\nI love my country");
		writer.flush();
		
		char[] charArray= {'a','e','i','o','u'};
		writer.write("\n");
		writer.write(charArray);
		
		writer.flush();
		
		//writer.close();
	   }catch(IOException e){
		   e.printStackTrace();
		} /*
			 * finally { try { if(writer!=null) { writer.close(); } }catch(IOException e){
			 * e.printStackTrace(); }
			 * 
			 * }
			 */
	   System.out.println();
	
	
}
}
