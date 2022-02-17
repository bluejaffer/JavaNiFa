package org.logicalprograms;

public class Descending {
	public static void main(String[] args) {
		int num[] = new int[5];
		num[0]=100;
		num[1]=10;
		num[2]=50;
		num[3]=190;
		num[4]=400;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]<num[j]) {
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

//to find the first big one 
//just give sysout(num[0])instead of for loop
//to find the second big one
//just give sysout(num[1])instead of for loop
