package com.patterns.model;

public class Pickup extends AbstractVan {

	public Pickup(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public Pickup(Engine engine, Color color) {
		super(engine, color);
	}
}
