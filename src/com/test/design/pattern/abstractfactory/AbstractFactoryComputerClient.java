package com.test.design.pattern.abstractfactory;

import com.test.design.pattern.factory.Computer;

public class AbstractFactoryComputerClient {

	public static void main(String[] args) {
		//factory of factory 
		Computer pc = ComputerFactoryNew.getComputer(new PCFactory());
		pc.getModel();
	}

}
