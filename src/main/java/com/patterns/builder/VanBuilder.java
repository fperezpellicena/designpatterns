package com.patterns.builder;

import com.patterns.model.AbstractVan;
import com.patterns.model.Vehicle;

public class VanBuilder extends VehicleBuilder {

	private AbstractVan van;

	public VanBuilder(AbstractVan van) {
		this.van = van;
	}

	public void buildBody() {
		System.out.println("Building van body");
	}

	public void buildChassis() {
		System.out.println("Building van chassis");
	}

	public void buildWindows() {
		System.out.println("Building van windows");
	}

	public void buildReinforcedStorageArea() {
		System.out.println("Building van storage area");
	}

	public Vehicle getVehicle() {
		return van;
	}
}
