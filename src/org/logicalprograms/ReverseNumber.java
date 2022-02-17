package org.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int f = 0;
		while(a>0) {
			int b = a%10;
			int c = a/10;
			a=c;
			f = b+(f*10);
			
		}
		System.out.println(f);
		}
}
