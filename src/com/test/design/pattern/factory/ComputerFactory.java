package com.test.design.pattern.factory;

public class ComputerFactory {
	// implementation of factory design pattern.
	public static Computer createComputer(ComputerType type, String config, String memory, String size) {
		Computer c = null;
		switch (type) {
		case PC:
			c = new PC();
			break;
		case SERVER:
			c = new Server();
			break;
		case SUPER_COMPUTER:
			c = new SuperComputer();
			break;
		}
		return c;
	}

}
