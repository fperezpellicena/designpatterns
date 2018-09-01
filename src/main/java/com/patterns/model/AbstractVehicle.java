package com.patterns.model;

public class AbstractVehicle implements Vehicle {

	protected Engine engine;
	protected Color color;

	public AbstractVehicle(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public AbstractVehicle(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
	}

	public void paint(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()
			+ "(" + engine + "," + color + ")";
	}
}
