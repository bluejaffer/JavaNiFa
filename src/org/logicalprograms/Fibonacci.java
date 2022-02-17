package org.logicalprograms;

public class Fibonacci {
public static void main(String[] args) {
	int f=0,s=1,t;
	for (int i = 0; i < 20; i++) {
		System.out.println(f);
		t=f+s;
		f=s;
		s=t;
	}
}
}
