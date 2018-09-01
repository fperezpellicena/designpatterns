package com.patterns.model;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public Saloon(Engine engine, Color color) {
		super(engine, color);
	}
}
