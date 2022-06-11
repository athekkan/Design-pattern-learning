package com.test.design.pattern.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		Computer c = new Computer.ComputerBuilder("TESST", "HELL").setBluetoothEnabled(true).build();
		System.out.println(c);
	}

}
