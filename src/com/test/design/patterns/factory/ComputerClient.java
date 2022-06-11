package com.test.design.pattern.factory;

public class ComputerClient {

	public static void main(String[] args) {
		Computer c = ComputerFactory.createComputer(ComputerType.SUPER_COMPUTER, null, null, null);
		c.getModel();
	}

}
