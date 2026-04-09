package com.javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try(FileReader reader=new FileReader("pledge.txt")){
			System.out.println("Reading the file content");
			int character;
			while((character =reader.read())!=-1) {
//			System.out.println("Ascii value returned by read() " +character);
//			System.out.println("Convert to charcter "+(char)character);
				System.out.print((char)character);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
