package com.seakie;

public class Car {
	private String plateNumber;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@Override
	public String toString() {
		return getPlateNumber();
	}
	
	
}
