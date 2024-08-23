package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

		public static void main(String[] args) throws IOException {
			FileOutputStream fos = new FileOutputStream("text.txt");
			String str = "Hello World ....How are you?";
			byte b[] = str.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("File Written Succesfully.");
			
			FileInputStream fis = new FileInputStream("text.txt");
			int i;
			while ((i=fis.read())!=  -1) {
				System.out.print((char)i);
				
			}
			fis.close();

		}
}
