package com.patterns.builder;

import com.patterns.model.AbstractCar;
import com.patterns.model.Vehicle;

public class CarBuilder extends VehicleBuilder {

	private AbstractCar car;

	public CarBuilder(AbstractCar car) {
		this.car = car;
	}

	public void buildBody() {
		System.out.println("Building car body");
	}

	public void buildChassis() {
		System.out.println("Building car chassis");
	}

	public void buildWindows() {
		System.out.println("Building car windows");
	}

	public Vehicle getVehicle() {
		return car;
	}
}
