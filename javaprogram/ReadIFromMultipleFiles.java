package com.cts.training.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadIFromMultipleFiles {

	public static void main(String[] args) throws IOException {
	FileInputStream fin1=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\fileexample\\file1.txt");
	FileInputStream fin2=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\fileexample\\file2.txt");
	SequenceInputStream sis=new SequenceInputStream(fin1, fin2);
	
	int i;
	while((i=sis.read()) !=-1)
	{
		System.out.print((char)i);

	}
}

}
;