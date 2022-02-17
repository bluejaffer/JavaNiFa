package org.java;

public class Greater {
public static void main(String[] args) {
	int a[] = new int[6];
	a[0]=7;
	a[1]=50;
	a[2]=34;
	a[3]=9;
	a[4] = 80;
	a[5] = 74;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i] < a[j]) {
				int b = a[i];
				a[i] = a[j];
				a[j] = b;
			}
		}
	}
	for (int k = 0; k < 3; k++) {
		System.out.println(a[k]);
	}
}
}
