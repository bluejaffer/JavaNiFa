package com.task;

public class Sample1 implements Sample2 , Sample3 {
	
	@Override
	public void method2() {
		System.out.println("method two");
		
	}
	@Override
	public void method3() {
		System.out.println("method three");
	}

	@Override
	public void method1() {
		System.out.println("method one");

	}
	
public static void main(String[] args) {
	Sample1 s = new Sample1();
	s.method1();
	s.method2();
	s.method3();
	
}


}