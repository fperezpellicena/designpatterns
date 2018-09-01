package com.patterns.model;

public class BoxVan extends AbstractVan {

	public BoxVan(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	public BoxVan(Engine engine, Color color) {
		super(engine, color);
	}
}
