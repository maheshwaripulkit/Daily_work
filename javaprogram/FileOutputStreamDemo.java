package com.cts.training.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data.txt";
		FileOutputStream out = new FileOutputStream(path, true);

		String message = "This is my first file example";
		byte b[] = message.getBytes();
		out.write(b);
		out.close();

	}

}
