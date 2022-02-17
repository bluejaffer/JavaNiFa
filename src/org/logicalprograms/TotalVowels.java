package org.logicalprograms;

public class TotalVowels {
public static void main(String[] args) {
	String s= "java application";
	char[] c = s.toCharArray();
	int count = 0;
	for (int i = 0; i < c.length; i++) {
		char x = c[i];
		if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
			count++;
		}
	}
	System.out.println("No of Vowels in the String : " + count);
}
}
