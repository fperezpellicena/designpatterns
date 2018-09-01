package com.patterns.builder;

import com.patterns.model.Vehicle;

public class VanDirector extends VehicleDirector {

	public Vehicle build(VehicleBuilder builder) {
		builder.buildBody();
		builder.buildChassis();
		builder.buildWindows();
		builder.buildPassengersArea();
		builder.buildReinforcedStorageArea();
		return builder.getVehicle();
	}
}
