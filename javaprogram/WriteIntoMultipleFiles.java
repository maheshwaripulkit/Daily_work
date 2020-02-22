package com.cts.training.file;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoMultipleFiles {

	public static void main(String[] args) throws IOException {
		FileOutputStream obj1=new FileOutputStream( "C:\\Users\\admin\\eclipse-workspace\\fileexample\\file1.txt");
		FileOutputStream obj2=new FileOutputStream( "C:\\Users\\admin\\eclipse-workspace\\fileexample\\file2.txt");
		FileOutputStream obj3=new FileOutputStream( "C:\\Users\\admin\\eclipse-workspace\\fileexample\\file3.txt");
	    FileOutputStream obj4=new FileOutputStream( "C:\\Users\\admin\\eclipse-workspace\\fileexample\\file4.txt");
	    ByteArrayOutputStream bout=new ByteArrayOutputStream();
	    String message="Trying to write same data into multiple files";
	    byte b[]=message.getBytes();
	    bout.write(b);
	    bout.writeTo(obj1);
	    bout.writeTo(obj2);
	    bout.writeTo(obj3);
	    bout.writeTo(obj4);
	    bout.close();
	    
	  
	
	
	}

}
