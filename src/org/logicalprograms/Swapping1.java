package org.logicalprograms;

import java.util.Scanner;

public class Swapping1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("A = " + a);
		int b = s.nextInt();
		System.out.println("B = "+b);
		a =a+b;
		b=a-b;
		a=a-b;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
	}
}
