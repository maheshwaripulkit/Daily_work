package com.cognizant.training;

public class Stringexamples {

	public static void main(String[] args) {
		String input = "Global Warming"; // input string
		String lastFourDigits = ""; // substring containing last 4 characters

		if (input.length() > 4) {
			lastFourDigits = input.substring(input.length() - 4);
		} else {
			lastFourDigits = input;
		}
		// To display the last four characters.
		System.out.println("The last four digits are =" + lastFourDigits);
		// To display the substring starting from index 4 and ending at index 8.
		System.out.println("substring result =" + input.substring(4, 9));
		// To change the case of the given string.
		StringBuffer newStr = new StringBuffer(input);
		for (int i = 0; i < input.length(); i++) {

			// Checks for lower case character
			if (Character.isLowerCase(input.charAt(i))) {
				// Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(input.charAt(i)));
			}
			// Checks for upper case character
			else if (Character.isUpperCase(input.charAt(i))) {
				// Convert it into upper case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(input.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);

		// To replace all the occurrences of letter "a" in the string with "*"
		String replaceString = input.replace('a', '*');
		System.out.println(replaceString);
		// To check whether string has alphanumeric characters or not.
		boolean result = input.matches("^.*[^a-zA-Z0-9 ].*$");
		System.out.println("Alpha charcter is  " + result);

		int str1 = input.length();

		// To trim the last four characters from the string.
		System.out.println(input.substring(0, str1 - 4));
		// To trim the first four characters from the string
		System.out.println(input.substring(4, str1));
		// To display the starting index for the substring "Wa".

		String h = input.substring(str1 - 4);
		System.out.println("trim=" + h);

		String e = input.substring(4);
		System.out.println(e);

		int a = input.indexOf("Wa");
		System.out.println(a);
		// To check if the string is in title case.
		boolean ans=false;
		String[] words=input.split("\\s+");
		for(int i=0;i<words.length;i++)
		{
		char res = words[i].charAt(0);
		if(res>=65 && res<=90)
		{
			ans=true;
		}
		else
			ans=false;
			break;
		}
		System.out.println("Title case" + " "+ans);
	}
}
