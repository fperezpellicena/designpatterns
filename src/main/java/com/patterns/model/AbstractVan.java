package com.patterns.model;

public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public AbstractVan(Engine engine, Color color) {
		super(engine, color);
	}
}
