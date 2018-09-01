package com.patterns.factory;

import com.patterns.model.*;

public class CarFactory extends VehicleFactory {

	Vehicle selectVehicle(DrivingStyle drivingStyle) {
		if (drivingStyle == DrivingStyle.ECONOMICAL) {
			return new Saloon(new StandardEngine(1500));
		} else if (drivingStyle == DrivingStyle.MIDRANGE) {
			return new Coupe(new StandardEngine(1800));
		} else {
			return new Sport(new TurboEngine(2000));
		}
	}
}
