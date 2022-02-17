package org.logicalprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
public static void main(String[] args) {
	
	String s ="In The Name Of Allah , Allah Is The Creator of All Of Us ";
	String[] s1 = s.split(" ");
	Map<String, Integer> m = new LinkedHashMap<>();
	for (int i = 0; i < s1.length; i++) {
		if (m.containsKey(s1[i])) {
			Integer x = m.get(s1[i]);
			m.put(s1[i],x+1);
		}
		else {
			m.put(s1[i], 1);
		}
	}
	System.out.println(m);
}
}
