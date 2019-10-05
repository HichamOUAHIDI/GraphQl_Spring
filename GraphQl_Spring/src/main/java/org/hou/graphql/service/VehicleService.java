package org.hou.graphql.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hou.graphql.entity.Vehicule;
import org.hou.graphql.repository.VehiculeRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final VehiculeRepository vehicleRepository ;
    public VehicleService(final VehiculeRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }
    @Transactional
    public Vehicule createVehicle(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Vehicule vehicle = new Vehicule();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }
    @Transactional
    public List<Vehicule> getAllVehicles(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    @Transactional
    public Optional<Vehicule> getVehicle(final int id) {
        return this.vehicleRepository.findById(id);
    }
}