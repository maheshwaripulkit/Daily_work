package com.cts.training.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FileInputStreamDemo {
	public static void main(String... args) throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data.txt";
		String path2 = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\data2.txt";
		File file = new File(path);
		System.out.println("file name = "+file.getName());
		System.out.println("Parent name is path of file = "+file.getParent());
		System.out.println("Length of File = "+file.length());
		System.out.println("Total Space = "+file.getTotalSpace());
		FileInputStream in=new FileInputStream(file);
		FileOutputStream out=new FileOutputStream(path2);
		int i;
		while((i=in.read()) !=-1)
		{
			System.out.print((char)i);
		}
	}
}
