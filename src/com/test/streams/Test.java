package com.test.streams;

public class Test {
	
	public static class Parent{
		public String val = "P";
		public String print() {
			System.out.println("Inside parent");
			return val;
		}
	}
	
	public static class Child extends Parent{
		public String val = "C";
		public String print() {
			System.out.println("Inside Child");
			return val;
		}
	}

	public static void main(String[] args) {
	
		Parent p = new Child();						
		System.out.println(p.val );
		System.out.println(p.print());

	}

}
