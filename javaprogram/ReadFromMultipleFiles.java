package com.cts.training.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadFromMultipleFiles {

	public static void main(String[] args) throws IOException {
	FileInputStream fin1=new FileInputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\fileexample\\\\file1.txt");
	FileInputStream fin2=new FileInputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\fileexample\\\\file2.txt");
	FileInputStream fin3=new FileInputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\fileexample\\\\file1.txt");
	FileInputStream fin4=new FileInputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\fileexample\\\\file1.txt");
	Vector vector=new Vector();
	vector.add(fin1);
	vector.add(fin2);
	vector.add(fin3);
	vector.add(fin4);
	Enumeration em=vector.elements();
	SequenceInputStream sis=new SequenceInputStream(em);
	int a;
	while((a=sis.read())!=-1)
	{
		System.out.print((char)a);
	}
	
	}

}
