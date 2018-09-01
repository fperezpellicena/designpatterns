package com.patterns.builder;

import com.patterns.model.Vehicle;

public abstract class VehicleBuilder {

	public void buildBody() {}

	public void buildChassis() {}

	public void buildWindows() {}

	public void buildPassengersArea() {}

	public void buildReinforcedStorageArea() {}

	public abstract Vehicle getVehicle();
}
