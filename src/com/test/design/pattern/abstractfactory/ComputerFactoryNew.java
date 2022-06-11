package com.test.design.pattern.abstractfactory;

import com.test.design.pattern.factory.Computer;

public class ComputerFactoryNew {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
