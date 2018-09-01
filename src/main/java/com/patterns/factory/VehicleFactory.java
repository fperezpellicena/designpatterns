package com.patterns.factory;

import com.patterns.model.Vehicle;

public abstract class VehicleFactory {

	protected enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL};

	public Vehicle build(DrivingStyle drivingStyle, Vehicle.Color color) {
		Vehicle vehicle = selectVehicle(drivingStyle);
		vehicle.paint(color);
		return vehicle;
	}

	abstract Vehicle selectVehicle(DrivingStyle drivingStyle);
}
