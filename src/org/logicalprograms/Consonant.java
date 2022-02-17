package org.logicalprograms;

import java.util.HashMap;
import java.util.Map;

public class Consonant {
	public static void main(String[] args) {
		String s = "java application is easy";
		char[] c = s.toCharArray();
		Map<Character , Integer> m = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			char x = c[i];
			if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
			}
			else {
				if(m.containsKey(x)) {
					Integer y = m.get(x);
					m.put(x, y+1);
				}
				else {
					m.put(x, 1);
				}}
			}
		
		System.out.println(m);
	}
	}

