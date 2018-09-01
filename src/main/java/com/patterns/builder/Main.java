package com.patterns.builder;

import com.patterns.model.AbstractCar;
import com.patterns.model.Saloon;
import com.patterns.model.StandardEngine;
import com.patterns.model.Vehicle;

public class Main {

	public static void main(String args[]) {
		AbstractCar car = new Saloon(new StandardEngine(1200));
		VehicleBuilder builder = new CarBuilder(car);
		VehicleDirector director = new CarDirector();
		Vehicle carBuilt = director.build(builder);
		System.out.println(carBuilt);
	}
}
