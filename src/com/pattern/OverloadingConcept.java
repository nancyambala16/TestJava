package com.pattern;

public class OverloadingConcept {

	public void demo(int i) {
		System.out.println("inside void method "+i);
	}
	
	public int demo(double i) {
		System.out.println("inside int method "+i);
		
		return 1;
	}
	
	
	
	
	public static void main(String[] args) {
		OverloadingConcept oc=new OverloadingConcept();
		oc.demo(10.0);
		
	
	}
	
	
}
