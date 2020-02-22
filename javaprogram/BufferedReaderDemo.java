package com.cts.training.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the name = ");
		String name=br.readLine();
		System.out.println("Enter  your id = ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Name = "+name);
		System.out.println("id = "+id);

	}

}
