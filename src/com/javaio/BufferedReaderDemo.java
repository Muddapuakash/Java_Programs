package com.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderDemo {

	public static void main(String[] args) {
		try(BufferedReader reader=
				new BufferedReader(new FileReader("Output.txt"))){
			String line;
			System.out.println("Reading the file line by line by raedline()");
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
