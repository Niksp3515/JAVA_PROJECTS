package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
public static void main(String[] args) throws IOException {
	
	FileWriter fw = new FileWriter("input.txt");
	String str = "Hello Nikhil Prajapati";
	fw.write(str);
	fw.flush();
	fw.close();
	System.out.println("File Written Succesfully...");
	
	FileReader fr = new FileReader("input.txt");
	int i;
	while ((i=fr.read())!= -1) {
		System.out.print((char)i);
	}
	fr.close();
}

}
