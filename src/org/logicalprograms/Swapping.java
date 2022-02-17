package org.logicalprograms;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("A = " + a);
	int b = s.nextInt();
	System.out.println("B = "+b);
	int c =a+b;
	a=c-a;
	b=c-b;
	System.out.println("A = "+a);
	System.out.println("B = "+b);
	
}
}
