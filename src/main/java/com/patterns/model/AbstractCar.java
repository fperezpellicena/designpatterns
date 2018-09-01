package com.patterns.model;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public AbstractCar(Engine engine, Color color) {
		super(engine, color);
	}
}
