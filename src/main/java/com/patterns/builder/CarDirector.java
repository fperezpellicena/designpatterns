package com.patterns.builder;

import com.patterns.model.Vehicle;

public class CarDirector extends VehicleDirector {

	public Vehicle build(VehicleBuilder builder) {
		builder.buildBody();
		builder.buildChassis();
		builder.buildWindows();
		return builder.getVehicle();
	}
}
