package org.logicalprograms;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int d=a;
	int count = 0;
	int e = 0;
	int g=a;
	while(a>0) {
		int b = a%10;
		int c = a/10;
		a=c;
		count++;
	}
	while(d>0) {
		int b = d%10;
		int c = d/10;
		d=c;
		double pow = Math.pow(b, count);
		int f = (int)pow;
		e=e+f;
	}
	if (g==e) {
		System.out.println("Amstrong Number");
	}
	else {
		System.out.println("Not Amstrong Number");
	}
	}
}

