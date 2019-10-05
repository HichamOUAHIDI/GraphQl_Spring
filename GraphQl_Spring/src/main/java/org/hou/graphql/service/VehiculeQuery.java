package org.hou.graphql.service;

import java.util.List;
import java.util.Optional;

import org.hou.graphql.entity.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
@Component
public class VehiculeQuery implements GraphQLQueryResolver{
	 @Autowired
	    private VehicleService vehicleService;
	    public List<Vehicule> getVehicles(final int count) {
	        return this.vehicleService.getAllVehicles(count);
	    }
	    public Optional<Vehicule> getVehicle(final int id) {
	        return this.vehicleService.getVehicle(id);
	    }
}
