package org.logicalprograms;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	int f=n;
	while (n>1)
	{
		n--;
		f=f*n;
	
	}
	System.out.println(f);
}
}
