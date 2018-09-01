package com.patterns.factory;

import com.patterns.model.*;

public class VanFactory extends VehicleFactory {

	Vehicle selectVehicle(DrivingStyle drivingStyle) {
		if (drivingStyle == DrivingStyle.ECONOMICAL || drivingStyle == DrivingStyle.MIDRANGE) {
			return new Pickup(new StandardEngine(1500));
		} else {
			return new BoxVan(new TurboEngine(2000));
		}
	}
}
