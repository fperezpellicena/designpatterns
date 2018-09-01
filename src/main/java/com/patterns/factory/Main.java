package com.patterns.factory;

import com.patterns.model.Vehicle;

public class Main {

	public static void main(String args[]) {
		CarFactory factory = new CarFactory();
		Vehicle vehicle = factory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Color.SILVER);
		System.out.println(vehicle);
	}
}
