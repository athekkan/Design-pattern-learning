package com.test.design.pattern.builder;

/**
 * @author athekkan
 *
 */
public class Computer {

	private String HDD;
	private String RAM;
	
	//optional
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public String getRAM() {
		return RAM;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	//builder class
	public static class ComputerBuilder {
		private String HDD;
		private String RAM;
		
		//optional
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isEnabled) {
			this.isBluetoothEnabled = isEnabled;
			return this;
		}
		
		//build method to create Computer object
		public Computer build() {
			return new Computer(this);
		}
	}
	
	
}
