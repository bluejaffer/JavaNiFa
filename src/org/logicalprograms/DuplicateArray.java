package org.logicalprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {
public static void main(String[] args) {
	
	int num[] = new int[5];
	num[0] = 10;
	num[1] = 20;
	num[2] = 30;
	num[3] = 10;
	num[4] = 10;
	Set<Integer> s = new LinkedHashSet<>();
	for (int i = 0; i < num.length; i++) {
		s.add(num[i]);
		
	}
	for (Integer x : s) {
		System.out.println(x);
	}
	int length = num.length;
    int size = s.size();	
    System.out.println("No Of Duplicate Array : "+ (length-size));
}
}
