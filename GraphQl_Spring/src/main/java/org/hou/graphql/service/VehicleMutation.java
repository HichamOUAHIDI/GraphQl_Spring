package org.hou.graphql.service;

import org.hou.graphql.entity.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleMutation {
	 @Autowired
	    private VehicleService vehicleService;
	    public Vehicule createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
	        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
	    }
}
