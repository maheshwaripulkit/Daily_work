package com.cts.training.file;

import java.io.*;

public class Activity3 {
	// counting method
	public static void CountWord(String name) throws FileNotFoundException, IOException {
		int count = 0;
		String saver; // Save string in new variable
		// get file path
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\fileexample\\file2.txt");
		FileReader flr = new FileReader(file);
		BufferedReader bre = new BufferedReader(flr);
		// Condition check
		while ((saver = bre.readLine()) != null) {
			String[] words = saver.split(" ");
			for (String word : words) {
				if (word.equals(name)) {
					count++;
				}

			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\fileexample\\file2.txt"; // File Path
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter Word = ");
		String name = br.readLine();
		// Method Call
		CountWord(name);
	}
}