package org.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int count = 0 ,d = 0;
		for (int i = a; i <=b ; i++) {
		for (int j = 2; j >=(a-1); j++) {
			if(a%j==0) {
				count++;
				break;
			}
			if(count==0)	 
			 {
				d++; 
			 }}}
				System.out.println(d);
		
		 
			}
			}

		
	

