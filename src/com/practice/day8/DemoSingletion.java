package com.practice.day8;

class Singleton {
	//Eagar init vs lazy init
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}



public class DemoSingletion {
	public static void main(String[] args) {
		
	}
}
