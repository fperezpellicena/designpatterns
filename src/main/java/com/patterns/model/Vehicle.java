package com.patterns.model;

public interface Vehicle {

	enum Color {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER}

	void paint(Color color);
}
