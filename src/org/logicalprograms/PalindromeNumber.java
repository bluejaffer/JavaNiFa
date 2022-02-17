package org.logicalprograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int f = 0;
		int g = a;
		while(a>0) {
			int b = a%10;
			int c = a/10;
			a=c;
			f = b+(f*10);
		}
		if(g==f) {
			System.out.println(" Is A Palindrome Number");
		}
		else {
			System.out.println(" Is Not A Palindrome Number");
		}
		
		}
}
