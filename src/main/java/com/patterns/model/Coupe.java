package com.patterns.model;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public Coupe(Engine engine, Color color) {
		super(engine, color);
	}
}
