package org.logicalprograms;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count = 0;
		while(a>0) {
			int b = a%10;
			int c = a/10;
			a=c;
			count++;
		}
		System.out.println(count);
}
}