package com.patterns.model;

public class Sport extends AbstractCar {

	public Sport(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public Sport(Engine engine, Color color) {
		super(engine, color);
	}
}
