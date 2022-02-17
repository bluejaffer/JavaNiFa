package org.logicalprograms;

import java.util.Scanner;

public class Ascending {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	int d = s.nextInt();
	int e = s.nextInt();
	int[] num = {a,b,c,d,e};
	
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if (num[i]>num[j]) {
				int temp = num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
}
}



//to find the first least one 
//just give sysout(num[0])instead of for loop
//to find the second least one
//just give sysout(num[1])instead of for loop
