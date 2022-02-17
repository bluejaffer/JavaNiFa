package org.logicalprograms;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("The Given Number Is : "+ a);
	if(a%2==0) {
		System.out.println(a+" Is Even Number");
	}
	else {
		System.out.println(a+" Is Odd Number");
	}
	}
}

