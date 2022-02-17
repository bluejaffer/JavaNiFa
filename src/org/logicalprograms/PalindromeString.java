package org.logicalprograms;

public class PalindromeString {
public static void main(String[] args) {
	
	String s = "malayalam";
	String s1 = "";
	for (int i = s.length()-1; i>=0; i--) {
		char charAt = s.charAt(i);
		s1 = s1 + charAt;
	}
	System.out.println(s);
	System.out.println(s1);
	if (s.equals(s1)) {
		System.out.println("Palindrome String");
	}
	else {
		System.out.println("Not A Palindrome String");
		
	}
}
}
