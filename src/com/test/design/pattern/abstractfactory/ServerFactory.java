package com.test.design.pattern.abstractfactory;

import com.test.design.pattern.factory.Computer;
import com.test.design.pattern.factory.Server;

public class ServerFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new Server();
	}

}
