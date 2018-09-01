package com.patterns.builder;

import com.patterns.model.Vehicle;

public abstract class VehicleDirector {

	public abstract Vehicle build(VehicleBuilder builder);
}
