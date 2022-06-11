package com.test.design.pattern.abstractfactory;

import com.test.design.pattern.factory.Computer;
import com.test.design.pattern.factory.PC;
public class PCFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new PC();
	}

}
